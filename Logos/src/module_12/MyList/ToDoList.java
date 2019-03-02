package module_12.MyList;

import java.util.ArrayList;
import java.util.List;

public class ToDoList<T> {
  private List<T> list = new ArrayList<>();

  public boolean add(T item){
    list.add(item);
    return true;
  }

  public boolean remove(int index){
    list.remove(index);
    return true;
  }

  @Override
  public String toString() {
    return "ToDoList{" +
      "list=" + list +
      '}';
  }
}
