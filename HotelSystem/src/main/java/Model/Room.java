package Model;

import Service.Utils;

import java.io.Serializable;
import java.util.Objects;

public class Room implements Serializable{
  private int roomNumber;
  private User user;
  private boolean isReserved;
  private double price;
  private int id;
  private String city;

  public Room(int roomNumber, double price, String city) {
    this.roomNumber = roomNumber;
    this.price = price;
    this.isReserved = false;
    this.user = null;
    this.city = city;
    this.id = Utils.generateId();
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public int getId() {
    return id;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public boolean isReserved() {
    return isReserved;
  }

  public void setReserved(boolean reserved) {
    isReserved = reserved;
  }

  public int getRoomNumber() {
    return roomNumber;
  }

  public void setRoomNumber(int roomNumber) {
    this.roomNumber = roomNumber;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Room)) return false;
    Room room = (Room) o;
    return getRoomNumber() == room.getRoomNumber() &&
      Double.compare(room.getPrice(), getPrice()) == 0 &&
      getId() == room.getId();
  }

  @Override
  public int hashCode() {
    return Objects.hash(getRoomNumber(), getPrice(), getId());
  }

  @Override
  public String toString() {
    return "Room{" +
      "roomNumber=" + roomNumber +
      ", user=" + user +
      ", isReserved=" + isReserved +
      ", price=" + price +
      ", id=" + id +
      '}';
  }
}
