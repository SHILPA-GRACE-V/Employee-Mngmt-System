import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Employee
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> EmployeeName = new ArrayList();
        ArrayList<String> Id = new ArrayList();
        ArrayList<String> Salary = new ArrayList();
        ArrayList<String> Department = new ArrayList();

        while(true) {
            while(true) {
                System.out.println();
                System.out.println("Enter 1 for Employee Entry");
                System.out.println("Enter 2 to Search a Employee using ID");
                System.out.println("Enter 3 to Delete a Employee from the Register");
                System.out.println("Enter 4 to Exit");
                System.out.println();
                System.out.println("Please Enter your Option:");
                int option = sc.nextInt();
                String delStud;
                int index1;
                switch (option) {
                    case 1:
                        System.out.println("Please enter the Employee Name:");
                        delStud = sc.next();
                        EmployeeName.add(delStud);
                        System.out.println("Please enter the ID:");
                        String id = sc.next();
                        Id.add(id);
                        System.out.println("Please enter the Salary:");
                        String salary = sc.next();
                        Salary.add(salary);
                        System.out.println("Please enter the Department:");
                        String department = sc.next();
                        Department.add(department);
                        break;
                    case 2:
                        System.out.println("Enter the ID of the Employee:");
                        delStud = sc.next();
                        if (Id.contains(delStud)) {
                            index1 = Id.indexOf(delStud);
                            PrintStream var10000 = System.out;
                            Object var10001 = EmployeeName.get(index1);
                            var10000.println("Employee name : " + (String)var10001);
                            var10000 = System.out;
                            var10001 = Id.get(index1);
                            var10000.println("Admission Number : " + (String)var10001);
                            var10000 = System.out;
                            var10001 = Department.get(index1);
                            var10000.println("Department : " + (String)var10001);
                        } else {
                            System.out.println("Employee Not Found. Please check the details again!!");
                        }
                        break;
                    case 3:
                        System.out.println("Enter the ID of employee to be deleted:");
                        delStud = sc.next();
                        if (Id.contains(delStud)) {
                            index1 = Id.indexOf(delStud);
                            EmployeeName.remove(index1);
                            Id.remove(index1);
                            Salary.remove(index1);
                            Department.remove(index1);
                            System.out.println("Removed the Employee Successfully from the Register");
                        } else {
                            System.out.println("Employee Not Found. Please check the details again!!");
                        }
                        break;
                    case 4:
                        System.out.println("Exiting!!!");
                        break;
                    default:
                        System.out.println("Invalid Option. Please check the menu again!!");
                }
            }
        }
    }
}
