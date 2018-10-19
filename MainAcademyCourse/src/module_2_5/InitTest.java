package module_2_5;

public class InitTest {
  private int id;
  private static Integer nextId = 1 + (int) (Math.random()*1000);

  public InitTest() {
    this.id = nextId;
    nextId++;
  }

  public int getId() {
    return id;
  }
}
