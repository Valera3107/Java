package CoursePack;

import java.util.Arrays;
import java.util.Date;

public class Solution {
  public static void main(String[] args) {

    Course course1 = new Course(new Date(2018, 6, 24), "GO Frontend");
    Course course2 = new Course(new Date(2018, 5, 16), "GO Java");
    Course course3 = new Course(2,"GO Frontend", "Repeta");
    Course course4 = new Course(3,"GO Java", "Pavlov");
    Course course5 = new Course(1,"GO Frontend", "Sidorov");

    Student Petrow = new Student("Petrow", "Popovich", 5);
    Student Alex = new Student("Alex", "Sidorow", 4);
    Student Mikle = new Student( "Kovolev", new Course[]{course1, course4});

    SpecialStudent Max = new SpecialStudent("Max", "Eli", 4, 000110110);
    SpecialStudent Artur = new SpecialStudent("Bagratyan", new Course[]{course2, course4, course5});

    CollegeStudent Petr = new CollegeStudent("Hogvarts", 6, 6634, "Petr", "Karasikov", 6);
    CollegeStudent Octocat = new CollegeStudent("Octocat", "Github", 7);
    CollegeStudent Alexandr = new CollegeStudent("Repeta", new Course[]{course2, course5});
  }
}
