package javaprograms;
/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and English marks
 * marks is between 0 to 100 and if it is out of range print error message “Invalid Input, Marks should between 0 to 100”
 * find out total, percentage and result
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet.
 */

import java.util.Scanner;

public class MarkSheet_3 {

    public static void main(String[] args) {
        // scanner declaration
        Scanner scanner = new Scanner(System.in);

        // Input student name
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        // Input student roll number
        System.out.print("Enter roll number: ");
        int rollNo = scanner.nextInt();

        // Input marks for three subjects
        int mathMarks = getMarks(scanner, "Math");
        int scienceMarks = getMarks(scanner, "Science");
        int englishMarks = getMarks(scanner, "English");

        // Calculate total, percentage, and result
        int total = mathMarks + scienceMarks + englishMarks;
        double percentage = total / 3.0;
        String result = (percentage >= 35) ? "Pass" : "Fail";
        String grade = getGrade(percentage);

        // Print mark sheet
        printMarkSheet(name, rollNo, mathMarks, scienceMarks, englishMarks, total, percentage, result, grade);

        // Close the scanner
        scanner.close();
    }

    public static int getMarks(Scanner scanner, String subject) {
        int marks;
        while (true) {
            System.out.print("Enter marks for " + subject + ": ");
            marks = scanner.nextInt();
            if (marks >= 0 && marks <= 100) {
                break;
            } else {
                System.out.println("Invalid Input, Marks should be between 0 to 100");
            }
        }
        return marks;
    }

    public static String getGrade(double percentage) {
        if (percentage >= 80) {
            return "A+";
        } else if (percentage >= 60) {
            return "A";
        } else if (percentage >= 50) {
            return "B";
        } else if (percentage >= 35) {
            return "C";
        } else {
            return "Fail";
        }
    }

    public static void printMarkSheet(String name, int rollNo, int mathMarks, int scienceMarks, int englishMarks, int total, double percentage, String result, String grade) {
        System.out.println("\n_______________________________");
        System.out.println("|                             |");
        System.out.println("|          Mark Sheet         |");
        System.out.println("|_____________________________|");
        System.out.printf("| Name             : %s     |\n", name);
        System.out.printf("| Roll No         : %d      |\n", rollNo);
        System.out.println("|_____________________________|");
        System.out.println("| Subjects          :  Marks  |");
        System.out.println("|_____________________________|");
        System.out.printf("| Math             : %d      |\n", mathMarks);
        System.out.printf("| Science          : %d      |\n", scienceMarks);
        System.out.printf("| English          : %d      |\n", englishMarks);
        System.out.println("|_____________________________|");
        System.out.printf("| Total            : %d      |\n", total);
        System.out.println("|_____________________________|");
        System.out.printf("| Percentage       : %.1f    |\n", percentage);
        System.out.printf("| Result           : %s      |\n", result);
        System.out.printf("| Grade            : %s      |\n", grade);
        System.out.println("|_____________________________|");
    }
}

