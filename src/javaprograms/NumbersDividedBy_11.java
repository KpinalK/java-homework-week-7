package javaprograms;

/**
 * Write a java program to print the numbers between 1 to 100 which can be divided by 3 and 5 separately.
 */

public class NumbersDividedBy_11 {
    public static void main(String[] args) {
        // calling instance method into main method via object
        NumbersDividedBy_11 obj = new NumbersDividedBy_11(); //create object
        obj.m1();

        // directly calling static method into main method
        m2();
    }

    // create instance method
    public void m1() {
        System.out.println("Numbers between 1 and 100 divisible by 3: ");
        for (int a = 1; a <= 100; a++) {
            if (a % 3 == 0) {
                System.out.println(a + " ");
            }
        }
    }

    // create static method
    public static void m2() {
        System.out.println("Numbers between 1 and 100 divisible by 5: ");
        for (int a = 1; a <= 100; a++) {
            if (a % 5 == 0) {
                System.out.println(a + " ");
            }
        }
    }

}
