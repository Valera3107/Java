package CoursePack;

public class CollegeStudent extends Student{
  private String collegeName;
  private int rating;
  private long id;

  public CollegeStudent(String collegeName, int rating, long id, String firstName, String lastName, int group) {
    super(firstName, lastName, group);
    this.collegeName = collegeName;
    this.rating = rating;
    this.id = id;
  }

  public CollegeStudent(String firstName, String lastName, int group) {
    super(firstName, lastName, group);
  }

  public CollegeStudent(String lastName, Course[] coursesTaken) {
    super(lastName, coursesTaken);
  }

  public String getCollegeName() {
    return collegeName;
  }

  public int getRating() {
    return rating;
  }

  public long getId() {
    return id;
  }

  public void setCollegeName(String collegeName) {
    this.collegeName = collegeName;
  }

  public void setRating(int rating) {
    this.rating = rating;
  }

  public void setId(long id) {
    this.id = id;
  }
}


