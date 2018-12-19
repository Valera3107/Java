package module_2_15.AdditionalPractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MyArrayList implements MyCollection {
  private ArrayList list;

  @Override
  public int size() {
    return list.size();
  }

  @Override
  public boolean isEmpty() {
    return list.isEmpty();
  }

  @Override
  public boolean contains(Object o) {
    return list.contains(o);
  }

  @Override
  public Iterator iterator() {
    return null;
  }

  @Override
  public boolean add(Object o) {
    return list.add(o);
  }

  @Override
  public boolean remove(Object o) {
    return list.remove(o);
  }

  @Override
  public boolean addAll(Collection c) {
    return list.addAll(c);
  }

  @Override
  public boolean removeAll(Collection c) {
    return list.removeAll(c);
  }

  @Override
  public void clear() {
    list.clear();
  }
}
