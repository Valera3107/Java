import java.util.Arrays;

@FunctionalInterface
interface SumProcess<T extends Number> {
  double process(T x);
}

public class Main {
  public static void main(String[] args) {
    Integer[] arrOfItn = {23, 4, 65, 24, 34, 5, 4};
    Double[] doubles = {43.5, 23.0, 656.7, 43.6};
    String[] arrOfStr = {"nfrj", "rwnfus", "anjd", "owfh"};


    printArr(arrOfItn);
    printArr(arrOfStr);

    //System.out.println("Minimum number in double array: " + findMin(doubles));
    System.out.println("Maximum number in integer array: " + findMax(arrOfItn));

    Work work = new Work(1400, "Builder");
    work.addToWork(new Man("Peter", 23, Sex.MAN));
    //work.addToWork(new Child("Bob", 345, Sex.MAN, 4));
    work.addToWork(new Person<>("Gim", 45));
    work.getListOfWorker().stream().forEach(elem -> System.out.println("Worker -> " + elem.getName()));

    Person[] people = {new Person("Ivan", 83), new Person("Sasha", 19), new Man("Rick", 23, Sex.MAN), new Person("Antonyo", 45)};

    Arrays.sort(people, (s1, s2) -> {
      return s1.getName().compareTo(s2.getName());
    });

    Arrays.stream(people).forEach(elem -> System.out.println(elem.toString()));

    Arrays.sort(people, (a1, a2) -> {
      return a1.getAge() - a2.getAge();
    });

    System.out.println();
    Arrays.stream(people).forEach(elem -> System.out.println(elem.toString()));

    System.out.println("Sqrt sum for array: " + sumSqrtForArray(doubles, x -> makePow(x.doubleValue())));
  }

  public static <T extends Number> double sumSqrtForArray(T[] arr, SumProcess function) {
    double sum = 0;
    for (Number i : arr) {
      sum += function.process(i);
    }
    return sum;
  }

  public static <T extends Double> double makePow(T num) {
    return Math.pow(num, 2);
  }


  public static <T> void printArr(T[] arr) {
    Arrays.sort(arr);
    for (T word : arr
      ) {
      System.out.print(word + " ");
    }
    System.out.println();
  }

  public static <T extends Comparable<T>> T findMin(T[] arr) {
    T min = arr[0];
    for (T e : arr
      ) {
      if (e.compareTo(min) < 0) {
        min = e;
      }
    }
    return min;
  }

  public static <T extends Comparable<T>> T findMax(T[] arr) {
    T min = arr[0];
    for (T e : arr
      ) {
      if (e.compareTo(min) > 0) {
        min = e;
      }
    }
    return min;
  }
}
