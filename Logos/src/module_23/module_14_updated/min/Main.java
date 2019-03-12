package module_23.module_14_updated.min;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Set<Monster> monsters = new HashSet<>();
    monsters.add(new Monster("Godzila", 97));
    monsters.add(new Monster("Tinaboa", 67));
    monsters.add(new Monster("King Kong", 87));
    monsters.add(new Monster("Dragon", 99));
    monsters.add(new Monster("Vampire", 100));

    System.out.println("Before sort:");
    System.out.println(monsters);

    SortedSet<Monster> monsterSortedSet = new TreeSet<>(monsters);

    System.out.println("\n\nAfter sort:");
    System.out.println(monsterSortedSet);

    List<Monster> list = new ArrayList<>(monsters);
    list.sort((o1, o2) -> o2.getHp() - o1.getHp() != 0 ? o2.getHp() - o1.getHp() : o2.getName().compareTo(o1.getName()));
    System.out.println("\n\nAfter reverse sort:");
    System.out.println(list);
  }
}
