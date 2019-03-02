package module_12.MyList;

public class Main {
  public static void main(String[] args) {
    AlienList<String> alienList = new AlienList<>();
    alienList.add("rrr");
    alienList.add("ntdi");
    alienList.add("xnrf");
    alienList.add("jnrtg");
    alienList.add("crg");
    alienList.add("crt");
    alienList.add("xtxt");
    alienList.add("rtvh");
    alienList.add("cntuc");
    alienList.add("ccc");
    alienList.add("cun4");
    alienList.add("wcgtgc");

    System.out.println(alienList.toString());

    alienList.remove(4);
    alienList.remove(10);

    System.out.println(alienList.toString());

//    ToDoList<String> list = new ToDoList<>();
//    list.add("Gym");
//    list.add("Eating");
//    list.add("Studying");
//    list.add("Walking");
//
//    System.out.println(list);
//
//
//    list.remove(1);
//
//    System.out.println(list);
  }
}
