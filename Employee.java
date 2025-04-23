import java.util.Scanner;

class Employee {
  String empcode, name;
  double salary;

  Employee(String code, String name, double salary) {
    empcode = code;
    this.name = name;
    this.salary = salary;
  }
}

class EmployeeApp {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    Employee[] employees = new Employee[3];

    for (int i = 0; i < 3; i++) {
      System.out.println("\nEnter details for employee " + (i + 1) + ":");
      System.out.print("Enter employee code: ");
      String empcode = sc.nextLine();
      System.out.print("Enter employee name: ");
      String name = sc.nextLine();
      System.out.print("Enter employee salary: ");
      double salary = sc.nextDouble();
      sc.nextLine();

      employees[i] = new Employee(empcode, name, salary);
    }

    System.out.print("\nEnter employee code to search: ");
    String searchCode = sc.nextLine();

    boolean found = false;
    for (int i = 0; i < 3; i++) {
      if (employees[i].empcode.equals(searchCode)) {
        System.out.println("\nEmployee details found:");
        System.out.println("EmpCode: " + employees[i].empcode);
        System.out.println("Name: " + employees[i].name);
        System.out.println("Salary: " + employees[i].salary);
        found = true;
        break;
      }
    }

    if (!found) {
      System.out.println("\nEmployee not found with code: " + searchCode);
    }

    sc.close();
  }
}

