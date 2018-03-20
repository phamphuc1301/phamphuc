package phucpv5.entities;

import java.io.Serializable;

public class Employee implements Serializable {
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  private String name;
  private int age;
  private String address;
  private String departmentName;
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }
  public String getDepartmentName() {
    return departmentName;
  }
  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }
  /**
   * @param name
   * @param age
   * @param address
   * @param departmentName
   */
  public Employee(String name, int age, String address, String departmentName) {
    super();
    this.name = name;
    this.age = age;
    this.address = address;
    this.departmentName = departmentName;
  }
  /**
   * 
   */
  public Employee() {
    super();
  }
  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return "NAME :"+this.name + "\tADDRESS: " +this.address +"\tDEPARTMENT NAME:"+this.departmentName+"\tAGE :"+this.age;
  }
  
  
  
  
}
