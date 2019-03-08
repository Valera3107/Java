package module_19;

import java.io.Serializable;
import java.util.*;
import java.io.File;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException, ClassNotFoundException {
    File file = new File("Employee.txt");
    Employee employee = new Employee(1010, "Victor", 4500);
    Methods.serialize(file, employee);
    System.out.println(Methods.deserialize(file));

    //=================================
    System.out.println("\n\n");

    File filePerson = new File("Person.txt");
    Person person = new Person(1101, "Ivan", 2500);
    Methods.serialize(filePerson, person);
    System.out.println(Methods.deserialize(filePerson));

    //=================================
    System.out.println("\n\n");

    List<Employee> list = new ArrayList<>();
    list.add(new Employee(10101, "Tom", 2344));
    list.add(new Employee(1101, "Rick", 2363));
    list.add(new Employee(1111, "Peter", 3635));
    list.add(new Employee(1001, "Alex", 6456));
    list.add(new Employee(1011, "Max", 3466));
    list.add(new Employee(1110, "Jack", 3456));

    File fileList = new File("List.txt");

    Methods.serialize(fileList, (Serializable) list);

    System.out.println(Methods.deserialize(fileList));
  }
}
