package module_2_1;

public class main {
  public static void main(String[] args) {
    Computer[] arrOfComputers = {
      new Computer("Apple", 1234, 2000),
      new Computer("Meizu", 3434, 1500, 34, 10),
      new Computer("Samsung", 1010, 2300, 54, 23)
    };

    Computer.view(arrOfComputers);
  }
}
