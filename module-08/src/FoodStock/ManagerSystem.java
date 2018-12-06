package FoodStock;

import java.util.*;

public class ManagerSystem implements IManageSystem<Food> {
  private Map<Food, Double> database = new HashMap<>();

  public Map<Food, Double> getDatabase() {
    return database;
  }

  @Override
  public Food save(Food obj, double price) {
    database.put(obj, price);
    return obj;
  }

  @Override
  public Food save(Food obj) {
    database.put(obj, 100.0);
    return obj;
  }

  @Override
  public void delete(Food obj) {
     database.remove(obj);
  }

  @Override
  public void deleteById(int id) {
    database.remove(get(id));
  }

  @Override
  public Food get(int id) {
    Iterator<Food> foodIterator = database.keySet().iterator();
    while (foodIterator.hasNext()) {
      if(foodIterator.next().getId() == id) {
        return foodIterator.next();
      }
    }
    return null;
  }

  @Override
  public Double getPrice(Food obj) {
    return database.get(obj);
  }

  @Override
  public Set<Food> getProducts() {
    Set<Food> foodSet = new HashSet<>();
    foodSet.addAll(database.keySet());
    return foodSet;
  }

  @Override
  public List<Double> getPrices() {
    List<Double> foodList = new ArrayList<>();
    foodList.addAll(database.values());
    return foodList;
  }

  public void printProductsSortedByName() {
    Map<Food, Double> foodMap = new TreeMap<>(new Comparator<Food>() {
      @Override
      public int compare(Food o1, Food o2) {
        return o1.getName().compareTo(o2.getName());
      }
    });
    foodMap.putAll(database);

    System.out.println("Sorted by name:");
    for (Map.Entry<Food, Double> e : foodMap.entrySet()
         ) {
      System.out.println(e.getKey() + " -> " + e.getValue());
    }
  }

  public void printProductsSortedByPrice() {
     NavigableSet<PriceComparator> comparatorNavigableSet = ComparatorNavigableSet(database);
    System.out.println("Sorted by price:");
     for (PriceComparator food : comparatorNavigableSet) {
       System.out.println(food.getFood() + " -> " + food.getPrice());
     }
  }

  public NavigableSet<PriceComparator> ComparatorNavigableSet(Map<Food, Double> database) {
    NavigableSet<PriceComparator> navigableSet = new TreeSet<>();
    for (Map.Entry<Food, Double> e: database.entrySet()
         ) {
      navigableSet.add(new PriceComparator(e.getKey(), e.getValue()));
    }

    return navigableSet;
  }


}
