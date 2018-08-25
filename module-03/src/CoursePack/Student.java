package CoursePack;

public class Student{
  private String firstName;
  private String lastName;
  private int group;
  private Course[] coursesTaken;
  private int age;

  public Student(String firstName, String lastName, int group) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.group = group;
  }

  public Student(String lastName, Course[] coursesTaken){
    this.lastName = lastName;
    this.coursesTaken = coursesTaken;
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

  public int getGroup() {
    return group;
  }

  public void setGroup(int group) {
    this.group = group;
  }

  public Course[] getCoursesTaken() {
    return coursesTaken;
  }

  public void setCoursesTaken(Course[] coursesTaken) {
    this.coursesTaken = coursesTaken;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
