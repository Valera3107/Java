package module_2_15;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();

    for (int i = 0; i < 10; i++) {
      list.add("number_" + i);
    }

    System.out.println(Arrays.toString(list.toArray()));

    //================

    List<String> stringList = new LinkedList<>();

    for (int i = 0; i < 10; i++) {
      stringList.add("num_" + (1 + (int) (Math.random() * 10)));
    }

    System.out.println(Arrays.toString(stringList.toArray()));

    //====================

    System.out.println("\nArrayList:");
    Iterator<String> iterator = list.iterator();
    while (iterator.hasNext()) System.out.println(iterator.next());


    System.out.println("\nLinkedList:");
    iterator = stringList.iterator();
    while (iterator.hasNext()) System.out.println(iterator.next());

    LinkedList<String> list1 = new LinkedList<>(list);
    ListIterator<String> listIterator = list1.listIterator();
    System.out.println("\nReverse order for ArrayList:");
    while (listIterator.hasPrevious()) System.out.println(listIterator.previous());

    //========================
    MyNumGenerator numGenerator = new MyNumGenerator(10, 20);
    System.out.println(Arrays.toString(numGenerator.generate().toArray()));

    //======================
    System.out.println(Arrays.toString(numGenerator.generateDistinct().toArray()));

    //=======================
    MyTranslator translator = new MyTranslator();
    System.out.println("\n");
    Scanner sc = new Scanner(System.in);

    int choice;
    boolean stop = false;
    String enWord;
    while (!stop) {
      System.out.println("1 - add new word, 2 - translate, 3 - translate sentence, 4 - stop");
      choice = sc.nextInt();
      switch (choice) {
        case 1:
          System.out.println("Input word in English: ");
          sc.nextLine();
          enWord = sc.nextLine();
          System.out.println("Input word in Russian: ");
          String rusWord = sc.nextLine();
          translator.addNewWord(enWord, rusWord);
          break;
        case 2:
          System.out.println("Input word in English: ");
          enWord = sc.nextLine();
          translator.translate(enWord);
          break;
        case 3:
          System.out.println("Input sentence:");
          String s = sc.nextLine();
          StringTokenizer stringTokenizer = new StringTokenizer(s, " ");
          while (stringTokenizer.hasMoreElements()) {
            translator.translate((String) stringTokenizer.nextElement());
          }
          break;
        case 4:
          stop = true;
          break;
      }
    }

  }
}
