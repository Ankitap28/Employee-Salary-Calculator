import java.util.Scanner;

public class Tester {
    public static void main(String[] args)  {
         // Create an array of object - 
        // Employee employees [] = new Employee[3]; 
        
        // employees[0] = new HourlyEmployee(1, "John", "Doe", 45, 19.95);
        // employees[1] = new SalariedEmployee(2, "Maria", "Smith", 7000);
        // employees[2] = new CommissionEmployee(3, "Jack", "Lee", 0.05, 1500, 100000);

        // // now we call the tostring to display details
        // for(int i=0; i<employees.length; i++) {
        //     System.out.println(employees[i]);
        //     System.out.println("\n");
        // }

        // Scanner scanner = new Scanner(System.in);
        // // System.out.println("Enter number of employees");
        //     //  int n = scanner.nextInt();
        //     int n=1;
        // Employee employees[] = new Employee[n];

        // for (int i = 0; i < n; i++) {
        //     System.out.println("Enter employee type (1 - Hourly, 2 - Salaried, 3 - Commission):");
        //     int employeeType = scanner.nextInt();

        //     System.out.println("Enter employee ID:");
        //     int employeeId = scanner.nextInt();

        //     System.out.println("Enter employee first name:");
        //     String firstName = scanner.next();

        //     System.out.println("Enter employee last name:");
        //     String lastName = scanner.next();

        //     if (employeeType == 1) {
        //         System.out.println("Enter hours worked:");
        //         int hoursWorked = scanner.nextInt();

        //         System.out.println("Enter hourly rate:");
        //         double hourlyRate = scanner.nextDouble();

        //         employees[i] = new HourlyEmployee(employeeId, firstName, lastName, hoursWorked, hourlyRate);
        //     } else if (employeeType == 2) {
        //         System.out.println("Enter monthly salary:");
        //         double monthlySalary = scanner.nextDouble();

        //         employees[i] = new SalariedEmployee(employeeId, firstName, lastName, monthlySalary);
        //     } else if (employeeType == 3) {
        //         System.out.println("Enter commission rate:");
        //         double commissionRate = scanner.nextDouble();

        //         System.out.println("Enter sales:");
        //         double sales = scanner.nextDouble();

        //         System.out.println("Enter base salary:");
        //         double baseSalary = scanner.nextDouble();

        //         employees[i] = new CommissionEmployee(employeeId, firstName, lastName, commissionRate, sales, baseSalary);
        //     }

        //     System.out.println();
        // }

        // // Display employee details
        // for (int i = 0; i < employees.length; i++) {
        //     System.out.println(employees[i]);
        //     System.out.println();
        // }

         Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        do {
            System.out.println("Enter employee type (1 - Hourly, 2 - Salaried, 3 - Commission, 0 - Exit):");
            int employeeType = scanner.nextInt();

            switch (employeeType) {
                case 1:
                    calculateHourlyEmployeeSalary(scanner);
                    break;
                case 2:
                    calculateSalariedEmployeeSalary(scanner);
                    break;
                case 3:
                    calculateCommissionEmployeeSalary(scanner);
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();
        } while (!exit);
    }

    private static void calculateHourlyEmployeeSalary(Scanner scanner) {
            System.out.println("Enter employee ID:");
            int employeeId = scanner.nextInt();

            System.out.println("Enter employee first name:");
            String firstName = scanner.next();

            System.out.println("Enter employee last name:");
            String lastName = scanner.next();
        System.out.println("Enter hours worked:");
        int hoursWorked = scanner.nextInt();

        System.out.println("Enter hourly rate:");
        double hourlyRate = scanner.nextDouble();

        HourlyEmployee hourlyEmployee = new HourlyEmployee(employeeId, firstName, lastName, hoursWorked, hourlyRate);
        System.out.println("Calculated salary: " + hourlyEmployee.calculateSalary());
    }

    private static void calculateSalariedEmployeeSalary(Scanner scanner) {
            System.out.println("Enter employee ID:");
            int employeeId = scanner.nextInt();

            System.out.println("Enter employee first name:");
            String firstName = scanner.next();

            System.out.println("Enter employee last name:");
            String lastName = scanner.next();
        System.out.println("Enter monthly salary:");
        double monthlySalary = scanner.nextDouble();

        SalariedEmployee salariedEmployee = new SalariedEmployee(employeeId, firstName, lastName, monthlySalary);
        System.out.println("Calculated salary: " + salariedEmployee.calculateSalary());
    }

    private static void calculateCommissionEmployeeSalary(Scanner scanner) {
            System.out.println("Enter employee ID:");
            int employeeId = scanner.nextInt();

            System.out.println("Enter employee first name:");
            String firstName = scanner.next();

            System.out.println("Enter employee last name:");
            String lastName = scanner.next();
        System.out.println("Enter commission rate:");
        double commissionRate = scanner.nextDouble();

        System.out.println("Enter sales:");
        double sales = scanner.nextDouble();

        System.out.println("Enter base salary:");
        double baseSalary = scanner.nextDouble();

        CommissionEmployee commissionEmployee = new CommissionEmployee(employeeId, firstName, lastName, commissionRate, sales, baseSalary);
        System.out.println("Calculated salary: " + commissionEmployee.calculateSalary());
    }
}

    

