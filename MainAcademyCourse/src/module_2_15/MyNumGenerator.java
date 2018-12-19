package module_2_15;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyNumGenerator {
  private int numOfElem;
  private int maxNumb;

  public MyNumGenerator(int numOfElem, int maxNumb) {
    this.numOfElem = numOfElem;
    this.maxNumb = maxNumb;
  }

  public List generate() {
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < numOfElem; i++) {
      list.add(0 + (int) (Math.random()*maxNumb));
    }
    return list;
  }

  public Set generateDistinct() {
    Set<Integer> integers = new HashSet<>();
    while(integers.size() != numOfElem) {
      integers.add(0 + (int) (Math.random()*maxNumb));
    }
    return integers;
  }
}
