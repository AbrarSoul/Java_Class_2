/*10. Write a program to enter the numbers till the user wants and at the end,
the program should display the largest and smallest numbers user entered.*/
package java_class_2;

import java.util.Scanner;

public class Problem_10 {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] < arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

    }
    public static void main(String[] args) {
        int numbers[] = new int[50];
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers to input: ");
        int range = input.nextInt();

        for(int i=0;i<range;i++)
        {
            numbers[i] = input.nextInt();
        }
        bubbleSort(numbers);
        System.out.print("Largest Number : ");
        System.out.println(numbers[0]);
        System.out.print("Smallest Number : ");
        System.out.print(numbers[range-1]);
    }
}
