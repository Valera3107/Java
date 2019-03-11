package module_21.Annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.io.*;
import java.lang.reflect.Field;

public class Main {
  public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
    Person person = new Person("Nick", "Fuire", 67, 54_000);
    File file = new File("Person.txt");


    writeToFile(file, person);
    readFile(file);
  }

  private static void writeToFile(File file, Serializable value) throws IOException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
    Class cl = value.getClass();
    Field[] fields = cl.getDeclaredFields();
    Method[] methods = {cl.getMethod("setName", String.class), cl.getMethod("setSurname", String.class), cl.getMethod("setAge", int.class), cl.getMethod("setSalary", int.class)};
    OutputStream os = new FileOutputStream(file);
    ObjectOutputStream oos = new ObjectOutputStream(os);
    Person p = new Person();
    for (int i = 0; i < fields.length; i++) {
      Field field = fields[i];
      field.setAccessible(true);
      if (field.getAnnotation(FileWrite.class).params()) {
        Object ob = field.get(value);
        methods[i].invoke(p,ob);
      }
    }
    oos.writeObject(p);
    oos.close();
  }

  private static void readFile(File file) throws IOException, ClassNotFoundException {
    InputStream is = new FileInputStream(file);
    ObjectInputStream ois = new ObjectInputStream(is);
    Serializable o = (Serializable) ois.readObject();
    System.out.println(o);
    ois.close();
  }

}
