package FoodStock;

import java.util.Objects;

public class Food implements Comparable<Food>{
  private int id;
  private String name;
  private Country country;
  private int expiration;


  public Food(String name, Country country, int expiration) {
    this.id = IdGenerator.generateId();
    this.name = name;
    this.country = country;
    this.expiration = expiration;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  public int getExpiration() {
    return expiration;
  }

  public void setExpiration(int expiration) {
    this.expiration = expiration;
  }

  public int getId() {
    return id;
  }

  @Override
  public String toString() {
    return "Food{" +
      "id=" + id +
      ", name='" + name + '\'' +
      ", country=" + country +
      ", expiration=" + expiration +
      '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Food)) return false;
    Food food = (Food) o;
    return getId() == food.getId() &&
      getExpiration() == food.getExpiration() &&
      Objects.equals(getName(), food.getName()) &&
      getCountry() == food.getCountry();
  }

  @Override
  public int hashCode() {

    return Objects.hash(getId(), getName(), getCountry(), getExpiration());
  }

  @Override
  public int compareTo(Food o) {
    return this.getName().compareTo(o.getName());
  }
}
