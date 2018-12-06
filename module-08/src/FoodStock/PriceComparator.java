package FoodStock;

public class PriceComparator implements Comparable<PriceComparator>{
  private final Food food;
  private final Double price;

  public PriceComparator(Food food, Double price) {
    this.food = food;
    this.price = price;
  }

  public Food getFood() {
    return food;
  }

  public Double getPrice() {
    return price;
  }

  @Override
  public int compareTo(PriceComparator o) {
    if(this.price > o.getPrice()) return 1;
    if(this.price < o.getPrice()) return -1;

    return 0;
  }
}
