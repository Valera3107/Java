package module_23.Rada;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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
    list.stream().filter(Deputy::isBriber).forEach(System.out::println);
  }

  public void printSuperBriber() {
    System.out.println("Super briber: " + list.stream().max(Comparator.comparingInt(Deputy::getBribe)).get());
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
