import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface ElementProcessor<T extends Number>{
  double process(T a, T b);
}

interface Operation {
  void process();

  static void measure(Operation function) {
    long start = System.currentTimeMillis();
    function.process();
    long finish = System.currentTimeMillis();
    System.out.println("Time spent: " + (finish - start));
  }

  default Operation combineOperation(Operation that) {
    return () -> {
      process();
      that.process();
    };
  }
}

public class LambdaMain2 {
  public static void main(String[] args) {
    List<Integer> integerList = new ArrayList<>();
    integerList.add(12);
    integerList.add(85);
    integerList.add(234);
    integerList.add(3);
    integerList.add(345);
    integerList.add(54);

    List<Double> doubleList = new ArrayList<>();
    doubleList.add(34.6);
    doubleList.add(43.5);
    doubleList.add(14.63);
    doubleList.add(87.34);
    doubleList.add(53.2);
    doubleList.add(65.1);
    doubleList.add(54.3);

    processorElement(integerList, (x, y) -> Math.pow(x.doubleValue(), y.doubleValue()));
    processorElement(doubleList, (x, y) -> Math.pow(x.doubleValue(), y.doubleValue()));

    Operation operation1 = () -> Arrays.sort(doubleList.toArray());
    Operation operation2 = () -> Arrays.sort(integerList.toArray());

    Operation.measure(operation1.combineOperation(operation2));

    String s = "word";
    Double d = 0.435;

    TransformUtils<Double> transformUtils = new TransformUtils<>();
    System.out.println(transformUtils.transform(d, Math::sqrt));

    TransformUtils<String> stringTransformUtils = new TransformUtils<>();
    System.out.println(stringTransformUtils.transform(s, TransformUtils::exclaim));

    String suffix = "Rocket";
    System.out.println(stringTransformUtils.transform(suffix, s::concat));

    LambdaScopeTest lambdaScopeTest = new LambdaScopeTest();
    LambdaScopeTest.LambdaScopeInner inner = lambdaScopeTest.new LambdaScopeInner();
    inner.testScope(44.99);
  }

  private static <T extends Number> void processorElement(List<T> numbers, ElementProcessor function) {
    List<Double> doubleList = new ArrayList<>();

    for(Number i : numbers) {
      doubleList.add(function.process(i, 2));
    }

    System.out.println(Arrays.toString(doubleList.toArray()));
  }

  private static int[] createRandomArray() {
    int[] arr = new int[1000000];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = 1 + (int) (Math.random()*999);
    }
    return arr;
  }

}
