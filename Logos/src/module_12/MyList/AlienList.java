package module_12.MyList;

import java.util.Arrays;

public class AlienList {
  private static final Object[] DEFAULT_CAPACITY = new Object[10];
  private static final Object[] EMPTY_ELEMENT_DATA = {};
  private Object[] array;

  public AlienList(int initialCapacity) {
    if(initialCapacity > 0){
      array = new Object[initialCapacity];
    } else if(initialCapacity == 0){
      array = EMPTY_ELEMENT_DATA;
    } else {
      throw new IllegalArgumentException("Illegal Capacity: "+
        initialCapacity);
    }
  }

  public AlienList(){
    array = DEFAULT_CAPACITY;
  }

  public boolean add(Object item){
    boolean isAdded = false;
    Object[] additionalArray = new Object[array.length*2];
    int addIndex = 0;
    for (int i = 0; i < array.length; i++) {
      if(array[i] == null){
        addIndex = i;
        isAdded = true;
      }
    }
    array[addIndex] = item;
    if (isAdded){
      return true;
    } else {
      System.arraycopy(array, 0, additionalArray, 0, array.length);
      array = additionalArray;
    }
    return false;
  }

  public  boolean delete(int index) {
    if(array[index] != null) {
      array[index] = null;
      array = removeElement(array, index);
      return true;
    }
    return false;
  }

  public static Object[] removeElement( Object[] arr, int index ){
    Object[] arrOut = new Object[arr.length - 1];
    int remainingElements = arr.length - ( index + 1 );
    System.arraycopy(arr, 0, arrOut, 0, index);
    System.arraycopy(arr, index + 1, arrOut, index, remainingElements);
    return arrOut;
  }

  @Override
  public String toString() {
    return "AlienList{" +
      "array=" + Arrays.toString(array) +
      '}';
  }
}
