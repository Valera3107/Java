package multithread;

import java.util.Random;

public class threadExample {
  public static void main(String[] args) {
    ThreadClass threadOne = new ThreadClass();
    ThreadClass threadTwo = new ThreadClass();
    threadOne.start();
    threadTwo.start();
    threadOne.setName("first thread");
    threadTwo.setName("Second thread");
    }
}

class ThreadClass extends Thread {
  @Override
  public void run() {
    int yourAge = 18 + (int) (Math.random()*45);
    int yourSalary = 300 + (int) (Math.random()*3500);
    int yourMonth = 1 + (int) (Math.random()*20);

    Bank bank = new Bank(yourAge, yourSalary, yourMonth);
    System.out.println(bank.getName() + " " + " " + bank.getAge() + " " + bank.getSalary() + " " + bank.getMonth());

    yourAge = 18 + (int) (Math.random()*45);
    yourSalary = 300 + (int) (Math.random()*3500);
    yourMonth = 1 + (int) (Math.random()*20);

    Bank bank1 = new Bank(yourAge, yourSalary, yourMonth);
    System.out.println(bank1.getName() + " " + " " + bank1.getAge() + " " + bank1.getSalary() + " " + bank1.getMonth());

    System.out.println(Bank.getNumOfEmp() + " num of emp ");
  }
}

class Bank {
  private static int numOfEmp = 0;
  private String name;
  private int age;
  private double salary;
  private int choice = 1 + (int) (Math.random()*4);
  private int month;

  public Bank(int age, double salary, int month) {
    this.month = 1 + (int) (Math.random()*20);
    this.name = setName(choice);
    this.age = age;
    this.salary = salary;
    numOfEmp++;
  }

  public synchronized void paySalary() {
    while (this.month !=0){
      this.month--;
      this.salary += 1000;
    }
  }

  public int getMonth() {
    return month;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public double getSalary() {
    return salary;
  }

  public synchronized static int getNumOfEmp() {
    return numOfEmp;
  }

  public synchronized String setName(int i) {
    switch (i) {
      case 1: return "Ivan";
      case 2: return "Petr";
      case 3: return "Mixa";
      default: return "Anonym";
    }
  }
}
