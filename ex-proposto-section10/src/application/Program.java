package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employeeList = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println();
            System.out.println("Employee #" + (i + 1));
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            while (hasId(employeeList, id)){
                System.out.println("Id already taken! Try again: ");
                id = sc.nextInt();
            }
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            System.out.println();

            employeeList.add(new Employee(id, name, salary));
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
//        Integer pos = position(employeeList, id);
        Employee employee = employeeList.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        if (employee == null){
            System.out.println("This id does not exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            employee.increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of employees: ");

        for(Employee emp : employeeList){
            System.out.println(emp);
        }

        sc.close();
    }

    public static Integer position(List<Employee> list, int id){
        for (int i=0; i < list.size(); i++){
            if (list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }

    public static boolean hasId(List<Employee> list, int id){
        Employee employee = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return employee != null;
    }
}
