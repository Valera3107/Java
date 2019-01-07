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
  private boolean inTheHotel;

  public Room(int roomNumber, double price, String city) {
    this.roomNumber = roomNumber;
    this.price = price;
    this.isReserved = false;
    this.inTheHotel = false;
    this.user = null;
    this.city = city;
    this.id = Utils.generateId();
  }

  public boolean isInTheHotel() {
    return inTheHotel;
  }

  public void setInTheHotel(boolean inTheHotel) {
    this.inTheHotel = inTheHotel;
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
    if(!isReserved() && !user.isHaveRoom()){
      this.user = user;
      user.setHaveRoom(true);
      setReserved(true);
    } else {
      System.out.println("Room is booked or with user. Choose another room.");
    }
  }

  public void releaseRoomFromUser(User user) {
    if(user.isHaveRoom() && isReserved) {
      user.setHaveRoom(false);
      setReserved(false);
      this.user = null;
    } else {
      System.out.println("This room is already free or user has not room yet.");
    }
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
