package phucpv5.utils;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import phucpv5.entities.Employee;

public class FileIO {
  public static void saveEmployee(List<Employee> listemp) {
    try {
      FileOutputStream out = new FileOutputStream("test.txt");
      ObjectOutputStream oout = new ObjectOutputStream(out);
      // oout.writeObject(listemp);
      for (Employee employee : listemp) {
        oout.writeObject(employee);
      }
      oout.close();
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  public static List<Employee> readEmployee()
      throws FileNotFoundException, IOException, ClassNotFoundException {
    @SuppressWarnings("resource")
    ObjectInputStream ois = new ObjectInputStream(
        new FileInputStream("test.txt"));
    // List<Employee> listOfEmployee = (List<Employee>) ois.readObject();
    List<Employee> employees = new ArrayList<>();
    try {
      while (true) {
        Employee employee = (Employee) ois.readObject();
        employees.add(employee);
      }
    } catch (EOFException ex) {
      return employees;
    }

  }
}
