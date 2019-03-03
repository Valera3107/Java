package module_13;

import java.util.*;

public class Fraction {
  private List<Deputy> list = new ArrayList<>();
  private String name;

  public Fraction(String name) {
    this.name = name;
  }

  public List<Deputy> getList() {
    return list;
  }

  public void setList(List<Deputy> list) {
    this.list = list;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void addDeputy(Deputy deputy){
    list.add(deputy);
  }

  public void deleteDeputy(int index){
    list.remove(index);
  }

  public void printBribers(){
    for (Deputy d :
      list) {
      if(d.isBriber()) System.out.println(d);
    }
  }

  public void printSuperBriber() {
    Deputy superBriver = list.get(0);
    for (Deputy d :
      list) {
      if (superBriver.getBribe() < d.getBribe()) {
        superBriver = d;
      }
    }
    System.out.println("Super briber: " + superBriver);
  }

  public void printAllDeputy() {
    list.forEach(System.out::println);
  }

  public void deleteAlldeputys(){
    list.clear();
  }

  @Override
  public String toString() {
    return "Fraction{" +
      "list=" + list +
      '}';
  }
}
