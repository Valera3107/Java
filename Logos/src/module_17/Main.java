package module_17;

public class Main {
  public static void main(String[] args) {
    Object[] objects = {3, 45, 53, 6, 45, 67, 647, 56, 7, 56, 7, 567, 76, 24, 14, 4232, 5, 245, 3, 453, 44, 24, 12, 6, 8};
    Collection collection = new Collection(objects);
    Collection.Planet planet = collection.new Planet();
    planet.printElements();
    planet.checkNumbers();

    //============================

    System.out.println("\n");
    Collection.StaticClass staticClass = new Collection.StaticClass();
    staticClass.checkNumbers();

    //============================

    System.out.println("\n");
    Iterator iterator = collection.function();
    iterator.checkNumbers();

    //============================

    System.out.println("\n");
    Iterator collectionAnonymous = collection.createAnonymous();
    collectionAnonymous.checkNumbers();

  }
}
