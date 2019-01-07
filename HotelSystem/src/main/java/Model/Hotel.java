package Model;

import Service.Utils;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Hotel implements Serializable {
  private String name;
  private String city;
  private List<Room> roomList;
  private int id;
  private int sizeOfHotel;

  public Hotel(String name, String city, int sizeOfHotel) {
    this.name = name;
    this.sizeOfHotel = sizeOfHotel;
    this.city = city;
    this.id = Utils.generateId();
  }

  public int getSizeOfHotel() {
    return sizeOfHotel;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public List<Room> getRoomList() {
    return roomList;
  }

  public void addRoomToTheHotel(Room room) {
    int size = getSizeOfHotel();
    if (getSizeOfHotel() > getRoomList().size() && getCity().equals(room.getCity()) && !room.isInTheHotel()) {
      roomList.add(room);
      size++;
      setSizeOfHotel(size);
      room.setInTheHotel(true);
      System.out.println("Room has added.");
    }
    if (!getCity().equals(room.getCity())) {
      System.out.println("Room and hotel in different city's.");
    } else {
      System.out.println("Hotel is full!");
    }
  }

  public void deleteRoomFromHotel(Room room) {
    int size = getSizeOfHotel();
    if(getCity().equals(room.getCity()) && room.isInTheHotel()){
      roomList.remove(room);
      size--;
      room.setInTheHotel(false);
      setSizeOfHotel(size);
      System.out.println("Room has deleted.");
    } else {
      System.out.println("Room and hotel in different city's or room is not in this hotel.");
    }
  }

  public void setSizeOfHotel(int sizeOfHotel) {
    this.sizeOfHotel = sizeOfHotel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Hotel)) return false;
    Hotel hotel = (Hotel) o;
    return getId() == hotel.getId() &&
      sizeOfHotel == hotel.sizeOfHotel &&
      Objects.equals(getName(), hotel.getName()) &&
      Objects.equals(getCity(), hotel.getCity());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getName(), getCity(), getId(), sizeOfHotel);
  }

  @Override
  public String toString() {
    return "Hotel{" +
      "name='" + name + '\'' +
      ", city='" + city + '\'' +
      ", roomList=" + roomList +
      ", id=" + id +
      ", sizeOfHotel=" + sizeOfHotel +
      '}';
  }
}
