/*4. Write a program to check balance and withdraw money from ATM booth using if else or switch case*/
package java_class_2;

import java.util.Scanner;

public class Problem_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Money");
        System.out.print("Enter your choice: ");
        int select = input.nextInt();
        int Set_pin = 2022;
        double balance = 20000;

        switch(select)
        {
            case 1:
                int count=0;
                while(true)
                {
                    System.out.print("Enter your PIN: ");
                    int pin = input.nextInt();
                    count++;
                    if(pin!=Set_pin)
                    {
                        System.out.println("Invalid PIN !");
                        if(count==3)
                        {
                            System.out.println("Last attempt! Then the Card will be blocked!");
                        }
                        if(count>3)
                        {
                            System.out.println("Card is blocked for security issue!");
                            System.exit(0);
                        }
                    }
                    else
                    {
                        System.out.print("Your available balance is : "+balance);
                        System.exit(0);
                    }

                }
            case 2:
                count=0;
                while(true)
                {
                    System.out.print("Enter your PIN: ");
                    int pin = input.nextInt();
                    count++;
                    if(pin!=Set_pin)
                    {
                        System.out.println("Invalid PIN !");
                        if(count==3)
                        {
                            System.out.println("Last attempt! Then the Card will be blocked!");
                        }
                        if(count>3)
                        {
                            System.out.println("Card is blocked for security issue!");
                            System.exit(0);
                        }
                    }
                    else
                    {
                        System.out.print("Enter the withdraw amount: ");
                        int amount = input.nextInt();
                        if((amount%500) != 0)
                        {
                            System.out.println("Balance is not divisible by 500");
                            System.out.println("Please try with another amount");
                            System.out.println("Only BDT 500.00 notes are available here.");
                        }
                        else if((amount%500) == 0)
                        {
                            if(amount>balance)
                            {
                                System.out.println("Not enough balance. Please input valid amount.");
                            }
                            else
                            {
                                balance = balance - amount;
                                System.out.print("BDT "+amount+ " has been debited from your account\n");
                                System.out.print("Available balance is BDT "+balance);
                                System.exit(0);
                            }
                        }
                    }

                }
            default:
                System.out.println("Please enter 1 or 2");
        }
    }
}
