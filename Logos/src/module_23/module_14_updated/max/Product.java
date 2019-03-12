package module_23.module_14_updated.max;

import java.util.Objects;

public class Product implements Comparable<Product>{
  private String name;
  private int length;
  private int width;
  private int weight;

  public Product(String name, int length, int width, int weight) {
    this.name = name;
    this.length = length;
    this.width = width;
    this.weight = weight;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getLength() {
    return length;
  }

  public void setLength(int length) {
    this.length = length;
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  @Override
  public String toString() {
    return "Product{" +
      "name='" + name + '\'' +
      ", length=" + length +
      ", width=" + width +
      ", weight=" + weight +
      '}';
  }

  @Override
  public int compareTo(Product o) {
    if(this.getName().compareTo(o.getName()) != 0) return this.getName().compareTo(o.getName());
    else if(this.getLength() != o.getLength()) return this.getLength() - o.getLength();
    else if(this.getWidth() != o.getWidth()) return this.getWidth() - o.getWidth();
    else if(this.getWeight() != o.getWeight()) return this.getWeight() - o.getWeight();
    else return 0;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Product)) return false;
    Product product = (Product) o;
    return Objects.equals(getName(), product.getName());
  }

  @Override
  public int hashCode() {

    return Objects.hash(getName());
  }
}

