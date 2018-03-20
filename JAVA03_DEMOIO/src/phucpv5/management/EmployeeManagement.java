package phucpv5.management;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import phucpv5.entities.Employee;

@SuppressWarnings("resource")
public class EmployeeManagement {
  
  /**
   * @Name create
   * @return
   * @Time : Mar 16, 2018
   * @Return type : Employee
   * @TODO : 
   */
  public Employee create(){
    Scanner sc = new Scanner(System.in);
    Employee employee = new Employee();
    System.out.print("ENTER NAME :\t");
    employee.setName(sc.nextLine());
    System.out.print("AGE :\t");
    employee.setAge(Integer.parseInt(sc.nextLine()));
    System.out.print("ADDRESS :\t");
    employee.setAddress(sc.nextLine());
    System.out.print("DEPARTMENT NAME :\t");
    employee.setDepartmentName(sc.nextLine());
    return employee;
  }
  
  public List<Employee> findByName(List<Employee> listEmp, String name) {
    List<Employee> newList = new ArrayList<>();
    for (Employee employee : listEmp) {
      if(employee.getName().equals(name)) {
        newList.add(employee);
      }
    }
    return newList;
  }
}
