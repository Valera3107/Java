import java.util.Objects;

public class User {
  private long id;
  private String firstName;
  private String lastName;
  private String city;
  private int balance;

  public User(long id, String firstName, String lastName, String city, int balance) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.city = city;
    this.balance = balance;
  }

  @Override
  public String toString() {
    return " / User: " + this.id + " " + this.firstName + " " + this.lastName + " " + this.city + " " + this.balance;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof User)) return false;
    User user = (User) o;
    return getId() == user.getId() &&
      getBalance() == user.getBalance() &&
      Objects.equals(getFirstName(), user.getFirstName()) &&
      Objects.equals(getLastName(), user.getLastName()) &&
      Objects.equals(getCity(), user.getCity());
  }

  @Override
  public int hashCode() {

    return Objects.hash(getId(), getFirstName(), getLastName(), getCity(), getBalance());
  }
}
