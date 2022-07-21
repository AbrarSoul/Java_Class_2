/*1. Write a program to check if inputted letter is small or capital*/
package java_class_2;

import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Input a character: ");
            char ch = input.next().charAt(0);

            if (ch >= 'A' && ch <= 'Z'){
                System.out.println("Capital letter");
            }
            else if (ch >= 'a' && ch <= 'z'){
                System.out.println("Small letter");
            }
            else{
                System.out.println("They are either numeric or other character");
            }
        }
    }
