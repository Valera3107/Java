import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsOverviewMain {
  //  private static List<Employee> employeeList = new ArrayList<>();
//  private static List<Employee> secondList = new ArrayList<>();
//  private static Map<Integer, Employee> employeeMap = null;
  private static List<Employees> employeeList = new ArrayList<>();

  public static void main(String[] args) throws IOException {
//    employeeList.add(new Employee(1, "Petr", "Krasnov", 34000));
//    employeeList.add(new Employee(2, "Dima", "White", 65000));
//    employeeList.add(new Employee(3, "Kiril", "Bereza", 55000));
//    employeeList.add(new Employee(4, "Sam", "Sereda", 65000));
//    employeeList.add(new Employee(5, "Mik", "Groshin", 54000));
//    employeeList.add(new Employee(6, "Max", "Teteli", 44000));
//    employeeList.add(new Employee(1, "Petr", "Krasnov", 34000));
//    employeeList.add(new Employee(10, "Sam", "Raime", 34000));
//    employeeList.add(new Employee(11, "Valera", "Great", 98000));
//    employeeList.add(new Employee(5, "Mik", "Groshin", 54000));
//    employeeList.add(new Employee(16, "Petr", "Krasnov", 34000));
//
//    secondList.add(new Employee(2, "Dima", "White", 65000));
//    secondList.add(new Employee(3, "Kiril", "Bereza", 55000));
//    secondList.add(new Employee(4, "Sam", "Sereda", 65000));
//    secondList.add(new Employee(1, "Petr", "Krasnov", 34000));
//    secondList.add(new Employee(5, "Mik", "Groshin", 54000));
//    secondList.add(new Employee(6, "Max", "Teteli", 44000));
//    secondList.add(new Employee(1, "Petr", "Krasnov", 34000));
//    secondList.add(new Employee(10, "Sam", "Raime", 34000));
//    secondList.add(new Employee(11, "Valera", "Great", 98000));
//    secondList.add(new Employee(5, "Mik", "Groshin", 54000));
//    secondList.add(new Employee(16, "Petr", "Krasnov", 34000));

    employeeList.add(new Employees(2, "Dima", "White", 65000, "IT"));
    employeeList.add(new Employees(3, "Kiril", "Bereza", 55000, "IT"));
    employeeList.add(new Employees(4, "Sam", "Sereda", 65000, "IT"));
    employeeList.add(new Employees(1, "Petr", "Krasnov", 34000, "IT"));
    employeeList.add(new Employees(5, "Mik", "Groshin", 54000, "Finance"));
    employeeList.add(new Employees(6, "Max", "Teteli", 44000, "Finance"));
    employeeList.add(new Employees(1, "Petr", "Krasnov", 34000, "IT"));
    employeeList.add(new Employees(10, "Sam", "Raime", 34000, "Finance"));
    employeeList.add(new Employees(11, "Valera", "Great", 98000, "IT"));
    employeeList.add(new Employees(5, "Mik", "Groshin", 54000, "IT"));
    employeeList.add(new Employees(16, "Petr", "Krasnov", 34000, "Finance"));

    //testStreamFromList();
    //testStreamFromFile();
    //testSortAndReduce();
    //partitionByIncome();
    //groupByCriterion(Employees::getJob);
    //testStreamGenerator(25);
    //testStreamIterator(10);
    testParalelStream();
  }

  private static void testParalelStream() throws IOException {
    employeeList.parallelStream()
      .map(Employees::getId)
      .sorted()
      .collect(Collectors.toList())
      .forEach(System.out::println);

    Files.lines(Paths.get("words.txt"))
      .parallel()
      .sorted()
      .forEach(System.out::println);
  }

  private static void testStreamIterator(int limit) {
    Stream.iterate(1, e -> e * 10).limit(limit).forEach(System.out::println);
  }

  private static void testStreamGenerator(int limit) {
    Stream.generate(Math::random).limit(limit).forEach(System.out::println);
  }

  private static <R> void groupByCriterion(Function<Employees, R> function) {
    Map<R, List<Employees>> collect = employeeList.stream()
      .collect(Collectors.groupingBy(function));

    collect.keySet().stream().forEach(e -> System.out.println("\n" + collect.get(e)));
  }

  private static void partitionByIncome() {
    Map<Boolean, List<Employees>> collect = employeeList.stream()
      .collect(Collectors.partitioningBy(e -> e.getSalary() > 50_000));
    System.out.println("RichEmp: " + collect.get(true));
    System.out.println("PoorEmp: " + collect.get(false));
  }

//  private static void testSortAndReduce() {
//    Employees employee = employeeList.stream()
//      .max(Comparator.comparingInt(Employees::getId))
//      .get();
//    System.out.println("Max: " + employee);
//
//    Employees employee1 = employeeList.stream()
//      .min(Comparator.comparingInt(Employees::getSalary))
//      .get();
//    System.out.println("Min: " + employee1);
//
//    employeeList.stream()
//      .sorted(Comparator.comparing(Employees::getFirstName)).distinct()
//      .collect(Collectors.toList()).forEach(System.out::println);
//
//    Employees firstElem = new Employees(0, "", "", 0);
//    Employees reduceEmp = employeeList.stream()
//      .reduce(firstElem, (e1, e2) -> {
//        e1.setId(e1.getId() + e2.getId());
//        e1.setSalary(e1.getSalary() + e2.getSalary());
//        return e1;
//      });
//
//    System.out.println(reduceEmp);
//
//  }

//  private static void testStreamFromFile() throws IOException {
//    Files.lines(Paths.get("words.txt"))
//      .filter(e -> e.length() <= 4)
//      .map(String::toUpperCase)
//      //.distinct()
//      //.sorted()
//      .collect(Collectors.toCollection(TreeSet::new))
//      .forEach(System.out::println);
//  }
//
//  private static void testStreamFromList() {
//    employeeList.stream()
//      .filter(e -> e.getSalary() >= 60_000)
//      .filter(e -> e.getId() >= 5)
//      .collect(Collectors.toList())
//      .forEach(System.out::println);
//
//    Integer[] ids = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
//    Stream.of(ids).map(StreamsOverviewMain::findById)
//      .filter(Objects::nonNull)
//      .collect(Collectors.toList())
//      .forEach(System.out::println);
//
//    Integer integer = Stream.of(ids)
//      .filter(e -> e % 2 == 0)
//      .filter(e -> e % 3 == 0)
//      .limit(1)
//      .findFirst()
//      .orElseGet(() -> (int) (Math.random() * 100));
//
//    System.out.println(integer);
//
//    int sum = Stream.of(ids)
//      .map(StreamsOverviewMain::findById)
//      .filter(Objects::nonNull)
//      .mapToInt(Employees::getSalary)
//      .sum();
//
//    OptionalDouble average = Stream.of(ids)
//      .map(StreamsOverviewMain::findById)
//      .filter(Objects::nonNull)
//      .mapToInt(Employees::getSalary)
//      .average();
//
//    List<List<Employees>> lists = new ArrayList<>();
//    lists.add(employeeList);
//    lists.add(secondList);
//
//    lists.stream().flatMap(l -> l.stream().map(e -> e.getFirstName())).forEach(System.out::println);
//
//    System.out.println("Total sum: " + sum);
//
//    Stream.of(ids).peek(e -> e *= 2).forEach(System.out::println);
//  }
//
//  private static Employees findById(int id) {
//    if (employeeMap == null) {
//      employeeMap = employeeList.stream().distinct().collect(Collectors.toMap(Employees::getId, e -> e));
//    }
//    return employeeMap.get(id);
//  }
}
