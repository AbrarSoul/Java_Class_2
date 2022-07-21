/*7. Write a program to print prime numbers from 2 to n*/
package java_class_2;

import java.util.Scanner;

public class Problem_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Prime numbers from 2 to ");
        int num = input.nextInt();
        int i=2;
        while(i<=num)
        {
            int j=2;
            while(j<=i)
            {
                if((i%j==0)&&(i>j))
                {
                    break;      // if the number(i) is divisible by any number(j) then it will break the loop
                }
                else if(j==i)                      // (j==i) means it is only divisible by itself
                {                                 // print the number(i) after checking with all the numbers(j)
                    System.out.print(i+" ");      // that it is not divisible by any number from 2 to n
                }
                j++;
            }
            i++;
        }
    }
}
