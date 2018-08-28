package RoomSystem;

import java.util.Date;

public class Room {
  private long id;
  private int price;
  private int persons;
  private Date dateAvailableFrom;
  private String hotelName;
  private String cityName;

  public Room(long id, int price, int persons, Date dateAvailableFrom, String hotelName, String cityName) {
    this.id = id;
    this.price = price;
    this.persons = persons;
    this.dateAvailableFrom = dateAvailableFrom;
    this.hotelName = hotelName;
    this.cityName = cityName;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getPersons() {
    return persons;
  }

  public void setPersons(int persons) {
    this.persons = persons;
  }

  public Date getDateAvailableFrom() {
    return dateAvailableFrom;
  }

  public void setDateAvailableFrom(Date dateAvailableFrom) {
    this.dateAvailableFrom = dateAvailableFrom;
  }

  public String getHotelName() {
    return hotelName;
  }

  public void setHotelName(String hotelName) {
    this.hotelName = hotelName;
  }

  public String getCityName() {
    return cityName;
  }

  public void setCityName(String cityName) {
    this.cityName = cityName;
  }
}
