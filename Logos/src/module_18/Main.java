package module_18;

import java.lang.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    List<List> mixedList = new ArrayList<>();

    ArrayList<String> strings = new ArrayList<>();
    ArrayList<Integer> integers = new ArrayList<>();

    mixedList.add(strings);
    mixedList.add(integers);

    HashMap<String, List> mapOfLists = new HashMap<>();

    mapOfLists.put("strings", strings);
    mapOfLists.put("integers", integers);

    mapOfLists.get("strings").add("value");
    mapOfLists.get("integers").add(10);

    /*
    * Если добавлять строго именно в List<Integer> елемент типа String, то будет ClassCastException
    * В данном варианте из-за совмещения двух списков мы спокойно можем добавлять и то и то значение в подходящие для нас вариант, но при
    *
    * mapOfLists.get("strings").add(10);
      mapOfLists.get("integers").add(value");

      будет все равно ClassCastException

    * */


    //=================================

    MyEntry<Integer, String> entry = new MyEntry<>(23, "Paprica");
    entry.getKey();
    entry.getValue();
    entry.setKey(43);
    entry.setValue("Kiko");
    System.out.println(entry);

    //===================================

    Map<Integer, String> map = new Map<>();
    map.addNewObject(2012, "Samsung");
    map.addNewObject(2019, "Apple");
    map.addNewObject(2016, "Nokia");
    map.addNewObject(2013, "Meizu");
    map.addNewObject(2014, "Lenovo");
    map.addNewObject(2015, "Honor");

    System.out.println("\n");
    map.printKeySet();
    System.out.println("\n");
    map.printValues();
    System.out.println("\n");
    map.printMap();

    map.removeByKey(2013);
    map.removeValue("Apple");

    map.printMap();
  }
}
