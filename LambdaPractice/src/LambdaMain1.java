import java.util.Arrays;

public class LambdaMain1 {
  public static void main(String[] args) {
    String[] colors = {"blue", "grey", "black", "yellow", "white", "paleviolet"};

    Man man1 = new Man("Petrov", 20);
    Man man2 = new Man("Charley", 34);
    Man man3 = new Man("Dima", 34);
    Man man4 = new Man("Kiril", 14);
    Man man5 = new Man("Kiril", 74);


    Man[] men = {man1, man2, man3, man4, man5};

    Arrays.sort(colors, (String s1, String s2) -> s1.charAt(s1.length()-1) - s2.charAt(s1.length()-1));

    System.out.println("After lambda sorting: " + Arrays.toString(colors));

    Arrays.sort(men, (Man m1, Man m2) -> {
      if (m1.age - m2.age == 0) return m1.name.length() - m2.name.length();
      else return m1.age - m2.age;
    });

    System.out.println("After lambda sorting: " + Arrays.toString(men));
  }

  private static class Man {
    private String name;
    private int age;

    public Man(String name, int age) {
      this.name = name;
      this.age = age;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public int getAge() {
      return age;
    }

    public void setAge(int age) {
      this.age = age;
    }

    @Override
    public String toString() {
      return "Man{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
    }
  }
}
