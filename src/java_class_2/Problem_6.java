/*6. Write  a program to find the factorial of a given number*/
package java_class_2;

import java.util.Scanner;

public class Problem_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int factorial = 1;    // because factorial of 0 is 1
        int num = input.nextInt();

        for(int i=1;i<=num;i++){
            factorial=factorial*i;
        }
        System.out.println("Factorial of this number: "+factorial);
    }
}
