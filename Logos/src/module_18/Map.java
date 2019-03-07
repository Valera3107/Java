package module_18;

import javax.swing.*;
import java.util.*;

public class Map<K, V> {
  private HashMap<K, V> map = new HashMap<>();

  public void addNewObject(K key, V value) {
    map.put(key, value);
    System.out.println("New object has been added!");
  }

  public void removeByKey(K key) {
    map.remove(key);
    System.out.println("Object has been deleted!");
  }

  public void removeValue(V value) {
    for (K k :
      map.keySet()) {
      if (map.get(k).equals(value)) {
        map.replace(k, value, null);
        System.out.println("Value have been deleted");
      }
    }
  }

  public void printKeySet(){
    Set<K> set = new HashSet<>();
    for (K key :
      map.keySet()) {
      set.add(key);
    }
    System.out.println(set);
  }

  public void printValues(){
    List<V> values = new ArrayList<>();
    for (V v :
      map.values()) {
      values.add(v);
    }
    System.out.println(values);
  }

  public void printMap(){
    for (K k:
         map.keySet()) {
      System.out.println(k + " -> " + map.get(k));
    }
  }
}

//  Додавали новий об’єкт в мапу
//
// Видаляли об’єкт мапи за ключем(тобто немає ні ключа ні значення)
//
// Видаляли об’єкт мапи за значенням(значенню об’єкта присвоюється нульова спилка, при цьому зберігається ключ)
//
// Виводили на екран Set ключів
//
// Виводили на екран List значень
//
// Виводили на екран цілу мапу

