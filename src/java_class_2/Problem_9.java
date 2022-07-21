/*9. Write a program to sum of user input until users input ‘q’ from keyboard*/
package java_class_2;

import java.util.Scanner;

public class Problem_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count=0;
       // System.out.println("Enter numbers: ");

        while(true)
        {
            System.out.println("1. Press any character and then 'Enter' to input a number ");
            System.out.println("2. Press 'q' and then 'Enter' to exit");
            String string = input.next();
            System.out.println(string);

            if(string.compareTo("q")==0)
            {
                System.out.println("Total: "+count);
                System.out.println("Program ended.");
                break;
            }
            else
            {
                System.out.println("Input a number: ");
                int num = input.nextInt();
                count = count+num;
               // System.out.println(count);
            }
        }
    }
}
