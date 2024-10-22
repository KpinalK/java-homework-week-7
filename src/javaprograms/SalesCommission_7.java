package javaprograms;

import java.util.Scanner;

/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and then fined this sales Commission
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */
public class SalesCommission_7 {
    // sales data
    String salesId;
    System sellerName;
    double salesAmount;
    double salaryBasic;

    public static void main(String[] args) {
        //declare scanner
        Scanner scanner = new Scanner(System.in);

        // input sales information
        System.out.println("Enter Sales ID: ");
        String salesId = scanner.nextLine();

        System.out.println("Enter Seller's Name: ");
        String sellerName = scanner.nextLine();

        System.out.println("Enter Sales Amount: ");
        double salesAmount = scanner.nextDouble();

        System.out.println("Enter Salary Basic: ");
        double salaryBasic = scanner.nextDouble();

        //directly calling calculateCommission method into main method
        double commission = calculateCommission(salesAmount);

        // display result
        System.out.println("Sales ID: " + salesId);
        System.out.println("Seller's Name: " + sellerName);
        System.out.println("Sales Amount: " + salesAmount);
        System.out.println("Salary Basic: " + salaryBasic);
        System.out.println("Commission: " + commission);

        // close scanner
        scanner.close();
    }

    //create method
    public static double calculateCommission(double salesAmount) {
        if (salesAmount >= 50000) {
            return salesAmount * 0.35;
        } else if (salesAmount >= 30000) {
            return salesAmount * 0.20;
        } else if (salesAmount >= 20000) {
            return salesAmount * 0.10;
        } else if (salesAmount >= 10000) {
            return salesAmount * 0.05;
        } else {
            return salesAmount * 0.02;
        }
    }

}
