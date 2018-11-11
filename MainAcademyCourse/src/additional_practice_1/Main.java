package additional_practice_1;

import java.io.FileReader;
import java.io.FileWriter;
import java.security.SecureRandomSpi;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws Exception{
    HashSet personList =  new HashSet();
    personList.add(new Person(generateID(), "Piter", "Parker", 21, "man", "New York", "Programmer", 1500 ,new Animal("Barsic", 12, "cat")));
    personList.add(new Person(generateID(), "Harry", "Potter", 25, "man", "Chicago", "Magic-man", 0 ,new Animal("Rex", 20, "dog")));
    personList.add(new Person(generateID(), "Frank", "Sinatra", 42, "man", "Washington", "Singer", 200_000 ,new Animal("Kesha", 4, "bird")));
    personList.add(new Person(generateID(), "Alkapone", "Sigei", 56, "man", "Miami", "Thief", 1_000_000 ,new Animal("Piti", 23, "monkey")));
    personList.add(new Person(generateID(), "Marry", "Uaid", 36, "woman", "California", "Police",5_000 ,new Animal("Muai", 3, "car")));

    fileWrite("Person.txt", personList);
    fileRead("Person.txt");
  }

  public static void fileWrite(String str, HashSet personList) throws Exception {
    FileWriter fw = new FileWriter(str);

    for (Object person: personList) {
      fw.write(person.toString() + "\n");
    }

    fw.close();
  }

  public static void fileRead(String str) throws Exception{
    FileReader fr = new FileReader(str);
    Scanner scan = new Scanner(fr);

    while (scan.hasNextLine()){
      System.out.println(scan.nextLine());
    }

    fr.close();
  }

  public static String generateID(){
    int intLinePart = 1000 + (int) (Math.random()*9999);
    String line = "AB";
    String line2 = "DB";
    return line + intLinePart + line2;
  }
}
