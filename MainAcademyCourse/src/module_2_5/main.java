package module_2_5;

public class main {
  public static void main(String[] args) {
    MyInitTest test = new MyInitTest(4.5f,6);

    //===============

    MyInit testOfFirstArray = new MyInit();
    testOfFirstArray.printArray();

    MyInit testOfSecArray = new MyInit();
    testOfSecArray.printArray();

    //===============

    InitTest testOne = new InitTest();
    System.out.println("Test 1 - " + testOne.getId());

    InitTest testTwo = new InitTest();
    System.out.println("Test 2 - " + testTwo.getId());

    InitTest testThree = new InitTest();
    System.out.println("Test 3 - " + testThree.getId());

    InitTest testFour = new InitTest();
    System.out.println("Test 2 - " + testFour.getId());

    InitTest testFive = new InitTest();
    System.out.println("Test 3 - " + testFive.getId());

  }
}
