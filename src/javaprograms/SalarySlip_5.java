package javaprograms;
/**
 * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
 * HRA = basic salary 10%
 * DA = Basic salary 8%
 * TA = Basic salary 9%
 * PF= Basic salary 20%
 * Gross salary = basic salary + HRA + TA + DA –PF
 */

import java.util.Scanner;

public class SalarySlip_5 {
    public static void main(String[] args) {
        //declare scanner
        Scanner scanner = new Scanner(System.in);

        // Input employee id
        System.out.print("Enter Employee ID: ");
        int employeeId = scanner.nextInt();
        scanner.nextLine(); // add newline

        // enter employee name
        System.out.print("Enter Employee Name: ");
        String employeeName = scanner.nextLine();

        // enter employee salary
        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        // Calculate HRA, DA, TA, PF, and Gross Salary
        double hra = basicSalary * 0.10; // 10% of Basic Salary
        double da = basicSalary * 0.08;   // 8% of Basic Salary
        double ta = basicSalary * 0.09;   // 9% of Basic Salary
        double pf = basicSalary * 0.20;   // 20% of Basic Salary
        double grossSalary = basicSalary + hra + ta + da - pf;

        // Print Salary Slip
        System.out.println();
        System.out.println("__________________________________");
        System.out.println("| Salary Slip                    |");
        System.out.println("|________________________________|");
        System.out.printf("| Employee ID      : %d        |%n", employeeId);
        System.out.printf("| Employee Name    : %s         |%n", employeeName);
        System.out.println("|________________________________|");
        System.out.printf("| Basic Salary     : %.1f     |%n", basicSalary);
        System.out.printf("| HRA 10%%          : %.1f      |%n", hra);
        System.out.printf("| TA 9%%            : %.1f      |%n", ta);
        System.out.printf("| DA 8%%            : %.1f      |%n", da);
        System.out.printf("| PF - 20%%         : %.1f      |%n", pf);
        System.out.println("|________________________________|");
        System.out.printf("| Gross Salary     : %.1f     |%n", grossSalary);
        System.out.println("|================================|");

        // Close the scanner
        scanner.close();
    }

}
