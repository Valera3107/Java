package module_19;

import java.util.*;
import java.io.*;

public class Methods {
  public static void serialize(File file , Serializable object) throws IOException {
    OutputStream os = new FileOutputStream(file);
    ObjectOutputStream oos = new ObjectOutputStream(os);
    oos.writeObject(object);
    oos.close();
  }

  public static Serializable deserialize(File file) throws IOException, ClassNotFoundException {
    InputStream is = new FileInputStream(file);
    ObjectInputStream ois = new ObjectInputStream(is);
    Serializable o =(Serializable) ois.readObject();
    ois.close();
    is.close();
    return o;
  }

  public static void serializeList(File file , List<Serializable> list) throws IOException {
    OutputStream os = new FileOutputStream(file);
    ObjectOutputStream oos = new ObjectOutputStream(os);
    oos.writeObject(list);
    oos.close();
  }

}
