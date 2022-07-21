/*3. Input 2 decimal numbers and check if they are both same or different
up to two decimal places. E.g 120.546 & 120.241*/
package java_class_2;

import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input first decimal point number: ");
        double num1 = input.nextDouble();
        System.out.print("Input second decimal point number: ");
        double num2 = input.nextDouble();

        if (Math.abs(num1 - num2) <= 0.009) {                  // because upto 2 decimal place
            System.out.println("These numbers are the same."); // for example, 10.011 and 10.012 will be same
        }                                                      // because there is 01 after point(.) in both number
        else {                                                 // but 10.001 and 10.010 will not be same
            System.out.println("These numbers are different.");// because upto 2 decimal point the numbers are
        }                                                      // 00 in 10.001 and 01 in 10.010 after point(.)
    }
}
