package module_12.MyList;


public class Main {
  public static void main(String[] args) {
    AlienList alienList = new AlienList();
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

    alienList.delete(4);
    alienList.delete(10);

    System.out.println(alienList.toString());

  }
}