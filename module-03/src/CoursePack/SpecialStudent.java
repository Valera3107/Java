package CoursePack;

public class SpecialStudent extends CollegeStudent{
  private String email;
  private long secretKey;

  public SpecialStudent(String firstName, String lastName, int group) {
    super(firstName, lastName, group);
  }

  public SpecialStudent(String lastName, Course[] coursesTaken) {
    super(lastName, coursesTaken);
  }

  public SpecialStudent(String firstName, String lastName, int group, long secretKey) {
    super(firstName, lastName, group);
    this.secretKey = secretKey;
  }

  public String getEmail() {
    return email;
  }

  public long getSecretKey() {
    return secretKey;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setSecretKey(long secretKey) {
    this.secretKey = secretKey;
  }
}
