package module_06;

import com.lgs.lab.interface2.MyCalculator;
import module_06.Worker.Employee;
import module_06.Worker.HourEmployee;
import module_06.Worker.MonthEmployee;
import module_06.Worker.Time;

public class Main {
  public static void main(String[] args) {

    //======================= 1

    Employee hourEmp = new Employee(Time.HOUR, "Vitalik", 15);
    Employee monthEmp = new Employee(Time.MONTH, "Alex", 4);

    hourEmp.salary();
    monthEmp.salary();

    HourEmployee hourEmployee = new HourEmployee("Dima", 28);
    MonthEmployee monthEmployee = new MonthEmployee(5, "Rick");

    hourEmployee.salary();
    monthEmployee.salary();

    //============================ 2

    MyCalculator calculator = new MyCalculator();
    calculator.devide(23,54);
    calculator.minus(29,7);
    calculator.multiply(2,4,5,4,5);
    calculator.sum(54,3,4,5,654,6,47,6);
  }
}
