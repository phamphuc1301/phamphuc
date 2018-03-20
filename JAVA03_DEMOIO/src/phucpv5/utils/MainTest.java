package phucpv5.utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import phucpv5.entities.Employee;
import phucpv5.management.EmployeeManagement;

public class MainTest {

  public static void main(String[] args) {
    EmployeeManagement manager = new EmployeeManagement();
    Employee employee = null;
    List<Employee> listOfEmployee = new ArrayList<>();
    List<Employee> listFindByName = new ArrayList<>();
    while (true) {
      System.out.println("1: ENTER EMPLOYEE");
      System.out.println("2: SAVE EMPLOYEE");
      System.out.println("3: LIST EMPLOYEE");
      System.out.println("5: FIND BY NAME");
      System.out.println("4: QUIT");
      System.out.print("COMMAND :\t");
      @SuppressWarnings("resource")
      Scanner sc = new Scanner(System.in);
      String action = sc.nextLine();
      switch (action) {
      case "1":
        employee = manager.create();
        listOfEmployee.add(employee);
        break;
      case "2":
        FileIO.saveEmployee(listOfEmployee);
        break;
      case "3":
        try {
          listOfEmployee = FileIO.readEmployee();
          for (Employee employee2 : listOfEmployee) {
            System.out.println(employee2);
          }
        } catch (ClassNotFoundException | IOException e) {
          System.out.println("FILE NOT FOUND");
        }
        break;
      case "4":
        System.exit(0);
      case "5":
        System.out.println("ENTER NAME TO FIND ");
        String name = sc.nextLine();
        listFindByName = manager.findByName(listOfEmployee, name);
        if (listFindByName.size() == 0) {
          System.out.println("NOT FOUND");
        } else {
          for (Employee employee2 : listFindByName) {
            System.out.println(employee2);
          }
        }
      default:
        System.out.println("COMMAND NOT FOUND");
        ;
      }
    }
  }
}
