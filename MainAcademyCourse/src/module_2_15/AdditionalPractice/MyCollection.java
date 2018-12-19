package module_2_15.AdditionalPractice;

import java.util.Collection;
import java.util.Iterator;

public interface MyCollection {
  int size();
  boolean isEmpty();
  boolean contains(Object o);
  Iterator iterator();
  boolean add(Object o);
  boolean remove(Object o);
  boolean addAll(Collection c);
  boolean removeAll(Collection c);
  void clear();
}
