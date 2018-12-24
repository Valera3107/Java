import java.util.ArrayList;
import java.util.LinkedList;

public class MainTime {
  public static void main(String[] args) {
    long start, finish;

    ArrayList<Integer> arrayList = new ArrayList<>();
    start = System.nanoTime();
    for (int i = 0; i < 1000; i++) {
      arrayList.add(i);
    }
    finish = System.nanoTime();
    System.out.println("ArrayList int adding time: " + (finish - start));

    start = System.nanoTime();
    for (int i = 0; i < 1000; i++) {
      arrayList.set(i, i+1);
    }
    finish = System.nanoTime();
    System.out.println("ArrayList int setting time: " + (finish - start));

    start = System.nanoTime();
    for (int i = 0; i < 1000; i++) {
      arrayList.get(i);
    }
    finish = System.nanoTime();
    System.out.println("ArrayList int getting time: " + (finish - start));

    start = System.nanoTime();
    for (int i = 0; i < 500; i++) {
      arrayList.remove(i);
    }
    finish = System.nanoTime();
    System.out.println("ArrayList int removing time: " + (finish - start));

    //============

    ArrayList<String> arrayList1 = new ArrayList<>();
    start = System.nanoTime();
    for (int i = 0; i < 1000; i++) {
      arrayList1.add("F");
    }
    finish = System.nanoTime();
    System.out.println("ArrayList string adding time: " + (finish - start));

    start = System.nanoTime();
    for (int i = 0; i < 1000; i++) {
      arrayList1.set(i, "G");
    }
    finish = System.nanoTime();
    System.out.println("ArrayList string setting time: " + (finish - start));

    start = System.nanoTime();
    for (int i = 0; i < 1000; i++) {
      arrayList1.get(i);
    }
    finish = System.nanoTime();
    System.out.println("ArrayList string getting time: " + (finish - start));

    start = System.nanoTime();
    for (int i = 0; i < 500; i++) {
      arrayList1.remove(i);
    }
    finish = System.nanoTime();
    System.out.println("ArrayList string removing time: " + (finish - start));

    System.out.println();

    LinkedList<Integer> linkedList = new LinkedList<>();
    start = System.nanoTime();
    for (int i = 0; i < 1000; i++) {
      linkedList.add(i);
    }
    finish = System.nanoTime();
    System.out.println("LinkedList int adding time: " + (finish - start));

    start = System.nanoTime();
    for (int i = 0; i < 1000; i++) {
      linkedList.set(i, i+1);
    }
    finish = System.nanoTime();
    System.out.println("LinkedList int setting time: " + (finish - start));

    start = System.nanoTime();
    for (int i = 0; i < 1000; i++) {
      linkedList.get(i);
    }
    finish = System.nanoTime();
    System.out.println("LinkedList int getting time: " + (finish - start));

    start = System.nanoTime();
    for (int i = 0; i < 500; i++) {
      linkedList.remove(i);
    }
    finish = System.nanoTime();
    System.out.println("LinkedList int removing time: " + (finish - start));

    LinkedList<String> linkedList1 = new LinkedList<>();
    start = System.nanoTime();
    for (int i = 0; i < 1000; i++) {
      linkedList1.add("F");
    }
    finish = System.nanoTime();
    System.out.println("LinkedList string adding time: " + (finish - start));

    start = System.nanoTime();
    for (int i = 0; i < 1000; i++) {
      linkedList1.set(i,"u");
    }
    finish = System.nanoTime();
    System.out.println("LinkedList string setting time: " + (finish - start));

    start = System.nanoTime();
    for (int i = 0; i < 1000; i++) {
      linkedList1.get(i);
    }
    finish = System.nanoTime();
    System.out.println("LinkedList string adding time: " + (finish - start));

    start = System.nanoTime();
    for (int i = 0; i < 500; i++) {
      linkedList1.remove(i);
    }
    finish = System.nanoTime();
    System.out.println("LinkedList string removing time: " + (finish - start));

  }
}
