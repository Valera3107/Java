package module_2_15.AdditionalPractice;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    //============ 1
    List<String> list = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      list.add("String number " + i);
    }

    System.out.println(Arrays.toString(list.toArray()));

    //============ 2
    List<String> list1 = new LinkedList<>();
    for (int i = 0; i < 10; i++) {
      list.add("String number " + i);
    }

    System.out.println(Arrays.toString(list.toArray()));

    //============ 3
    List<Integer> integerList = new ArrayList<>();

    for (int i = 0; i < 10; i++) {
      integerList.add(i);
    }

    Collections.swap(integerList, 9, 0);
    Collections.swap(integerList, 8, 1);

    System.out.println(Arrays.toString(integerList.toArray()));

    //============= 4
    List<Integer> integerList1 = new LinkedList<>();

    for (int i = 10; i > 0; i--) {
      integerList1.add(i);
    }
    Collections.swap(integerList1, 4, 6);
    Collections.swap(integerList1, 5, 7);

    System.out.println(Arrays.toString(integerList1.toArray()));

    //============= 5
    List<Integer> integerList2 = new ArrayList<>();

    for (int i = 0; i < 10; i++) {
      integerList2.add(i);
    }

    System.out.println("Before flip: ");
    System.out.println(Arrays.toString(integerList2.toArray()));

    for (int i = 0, j = (integerList2.size() - 1); i < j; i++, j--) {
      Collections.swap(integerList2, i, j);
    }

    System.out.println("After flip: ");
    System.out.println(Arrays.toString(integerList2.toArray()));

    //=============== 6

    List<Integer> integerList3 = new LinkedList<>();

    for (int i = 0; i < 10; i++) {
      integerList2.add(i);
    }

    System.out.println("Before flip: ");
    System.out.println(Arrays.toString(integerList2.toArray()));

    for (int i = 0, j = (integerList2.size() - 1); i < j; i++, j--) {
      Collections.swap(integerList2, i, j);
    }

    System.out.println("After flip: ");
    System.out.println(Arrays.toString(integerList2.toArray()));

    //============ 7

    List<Integer> list2 = new ArrayList<>();
    for (int i = 1; i < 11; i++) {
      list2.add(i);
    }

    System.out.println("was: " + Arrays.toString(list2.toArray()));

    for (int i = (list2.size() / 2) - 1, j = list2.size() - 1; i >= 0; i--, j--) {
      Collections.swap(list2, i, j);
    }

    System.out.println("after: " + Arrays.toString(list2.toArray()));

    //=============== 8
    List<Integer> list3 = new LinkedList<>();
    for (int i = 1; i < 11; i++) {
      list3.add(i);
    }

    System.out.println("was: " + Arrays.toString(list3.toArray()));

    for (int i = (list3.size() / 2) - 1, j = list3.size() - 1; i >= 0; i--, j--) {
      Collections.swap(list3, i, j);
    }

    System.out.println("after: " + Arrays.toString(list3.toArray()));

    //=================== 9

    List<Integer> list4 = new ArrayList<>();
    for (int i = 1; i < 11; i++) {
      list4.add(i);
    }

    List<Integer> list5 = new LinkedList<>();
    list5.addAll(list4);
    System.out.println(Arrays.toString(list5.toArray()));

    //================= 10
    List<Integer> listForSorting = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      listForSorting.add(1 + (int) (Math.random() * 10_000));
    }
    System.out.println("Before sorting" + Arrays.toString(listForSorting.toArray()));

    Collections.sort(listForSorting, new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        return o1 - o2;
      }
    });

    System.out.println("After sorting" + Arrays.toString(listForSorting.toArray()));

    //================= 11
    List<Integer> integerArrayList = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      integerArrayList.add(1 + (int) (Math.random() * 10_000));
    }
    System.out.println("Before sorting" + Arrays.toString(integerArrayList.toArray()));

    Collections.sort(integerArrayList, new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        return o1 - o2;
      }
    });

    System.out.println("After sorting" + Arrays.toString(integerArrayList.toArray()));

    //================ 12
    Long start;
    Long finish;
    int size = 300_000_000;
    List<Integer> list6 = new ArrayList<>();
//    start = System.currentTimeMillis();
    for (int i = 0; i < size; i++) {
      list6.add(55);
    }
//    finish = System.currentTimeMillis();
//
//    System.out.println("Time: " + (finish - start) / 1000 + "s");

    //============ 13

//    ArrayList<Integer> list7 = new ArrayList<>();
//    start = System.currentTimeMillis();
//    for (int i = 0; i < size; i++) {
//      list7.add(55);
//    }
//    finish = System.currentTimeMillis();
//
//    System.out.println("Time: " + (finish - start) / 1000 + "s");

    //============= 14
    int newSize = 100_000_000;
//    List<Integer> list8 = new ArrayList<>();
//    start = System.currentTimeMillis();
//    for (int i = 0; i < newSize; i++) {
//      list8.add(555);
//    }
//    finish = System.currentTimeMillis();
//
//    System.out.println("Time: " + (finish - start) / 1000 + "s");

    //================= 15

//    LinkedList<Integer> linkedList = new LinkedList<>();
//    start = System.currentTimeMillis();
//    for (int i = 0; i < newSize; i++) {
//      linkedList.add(55);
//    }
//    finish = System.currentTimeMillis();
//
//    System.out.println("Time: " + (finish - start) / 1000 + "s");

    //============== 16

//    start = System.currentTimeMillis();
//    list6.remove(5);
//    finish = System.currentTimeMillis();
//
//    System.out.println("Time for remove: " + (finish - start) / 1000 + "s");
//
//    start = System.currentTimeMillis();
//    list6.remove(size / 2);
//    finish = System.currentTimeMillis();
//
//    System.out.println("Time for remove: " + (finish - start) / 1000 + "s");
//
//    start = System.currentTimeMillis();
//    list6.remove(size - 2);
//    finish = System.currentTimeMillis();
//
//    System.out.println("Time for remove: " + (finish - start) / 1000 + "s");

    //============== 17

//    start = System.currentTimeMillis();
//    list6.set(5, 777);
//    finish = System.currentTimeMillis();
//
//    System.out.println("Time for remove: " + (finish - start) / 1000 + "s");
//
//    start = System.currentTimeMillis();
//    list6.set((size / 2), 777);
//    finish = System.currentTimeMillis();
//
//    System.out.println("Time for remove: " + (finish - start) / 1000 + "s");
//
//    start = System.currentTimeMillis();
//    list6.set(size - 2, 777);
//    finish = System.currentTimeMillis();
//
//    System.out.println("Time for remove: " + (finish - start) / 1000 + "s");

    //=============== 18

//    start = System.currentTimeMillis();
//    list6.add(5, 777);
//    finish = System.currentTimeMillis();
//
//    System.out.println("Time for remove: " + (finish - start) / 1000 + "s");
//
//    start = System.currentTimeMillis();
//    list6.add((size / 2), 777);
//    finish = System.currentTimeMillis();
//
//    System.out.println("Time for remove: " + (finish - start) / 1000 + "s");
//
//    start = System.currentTimeMillis();
//    list6.add(size - 2, 777);
//    finish = System.currentTimeMillis();
//
//    System.out.println("Time for remove: " + (finish - start) / 1000 + "s");

    //============== 19

//    start = System.currentTimeMillis();
//    linkedList.remove(5);
//    finish = System.currentTimeMillis();
//
//    System.out.println("Time for remove: " + (finish - start) / 1000 + "s");
//
//    start = System.currentTimeMillis();
//    linkedList.remove(size / 2);
//    finish = System.currentTimeMillis();
//
//    System.out.println("Time for remove: " + (finish - start) / 1000 + "s");
//
//    start = System.currentTimeMillis();
//    linkedList.remove(size - 2);
//    finish = System.currentTimeMillis();
//
//    System.out.println("Time for remove: " + (finish - start) / 1000 + "s");

    //============== 20

//    start = System.currentTimeMillis();
//    linkedList.set(5, 777);
//    finish = System.currentTimeMillis();
//
//    System.out.println("Time for remove: " + (finish - start) / 1000 + "s");
//
//    start = System.currentTimeMillis();
//    linkedList.set((size / 2), 777);
//    finish = System.currentTimeMillis();
//
//    System.out.println("Time for remove: " + (finish - start) / 1000 + "s");
//
//    start = System.currentTimeMillis();
//    linkedList.set(size - 2, 777);
//    finish = System.currentTimeMillis();
//
//    System.out.println("Time for remove: " + (finish - start) / 1000 + "s");

    //=============== 21

//    start = System.currentTimeMillis();
//    linkedList.add(5, 777);
//    finish = System.currentTimeMillis();
//
//    System.out.println("Time for remove: " + (finish - start) / 1000 + "s");
//
//    start = System.currentTimeMillis();
//    linkedList.add((size / 2), 777);
//    finish = System.currentTimeMillis();
//
//    System.out.println("Time for remove: " + (finish - start) / 1000 + "s");
//
//    start = System.currentTimeMillis();
//    linkedList.add(size - 2, 777);
//    finish = System.currentTimeMillis();
//
//    System.out.println("Time for remove: " + (finish - start) / 1000 + "s");

    //================= 22

//    ArrayList<Integer> arrayList = new ArrayList<>();
//
//    for (int i = 0; i < 2000; i++) {
//      arrayList.add(1 + (int) (Math.random() * 10_000));
//    }
//
//    start = System.currentTimeMillis();
//    bubbleSort(arrayList);
//    finish = System.currentTimeMillis();
//
//    System.out.println("Time for sorting: " + (finish - start) / 1000 + "s");

    //================= 23

//    LinkedList<Integer> linkedList1 = new LinkedList<>();
//
//    for (int i = 0; i < 2000; i++) {
//      linkedList1.add(1 + (int) (Math.random() * 10_000));
//    }
//
//    start = System.currentTimeMillis();
//    bubbleSort(linkedList1);
//    finish = System.currentTimeMillis();
//
//    System.out.println("Time for sorting: " + (finish - start) / 1000 + "s");

    //========== 24

    MyArrayList myArrayList = new MyArrayList();
    System.out.println(myArrayList.add(56));
    System.out.println(myArrayList.add(90));
    System.out.println(myArrayList.add(4));
    System.out.println(myArrayList.add("hh"));
    System.out.println(myArrayList.remove(4));
    System.out.println(myArrayList.isEmpty());
    System.out.println(myArrayList.size());
    System.out.println(myArrayList.contains(90));
  }

  public static void bubbleSort(List list) {
    int size = list.size();

    for (int i = 0; i < size - 1; i++) {
      for (int j = 0; j < size - i - 1; j++) {
        if (list.get(i).equals(list.get(j + 1))) {
          Collections.swap(list, i, j - 1);
        }
      }
    }
  }

}
