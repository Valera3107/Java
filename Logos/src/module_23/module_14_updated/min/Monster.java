package module_23.module_14_updated.min;

public class Monster implements Comparable{
  private String name;
  private int hp;

  public Monster(String name, int hp) {
    this.name = name;
    this.hp = hp;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getHp() {
    return hp;
  }

  public void setHp(int hp) {
    this.hp = hp;
  }


  @Override
  public int compareTo(Object o) {
    Monster monster = (Monster) o;
    if(this.hp != monster.getHp()){
      return this.hp - monster.getHp();
    } else {
      return this.name.compareTo(monster.getName());
    }
  }

  @Override
  public String toString() {
    return "Monster{" +
      "name='" + name + '\'' +
      ", hp=" + hp +
      '}';
  }
}
