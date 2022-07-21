/*8. Write a program to generate 2 random numbers which will not be shown to the user.
Take a user input and match it with any of the random numbers.
If correct give it 1 point and if incorrect, do not give it any point.
Finally, repeat this for 10 times and count the point user achieved.*/
package java_class_2;

import java.util.Scanner;

public class Problem_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int point=0;

        for(int i=1; i<=10; i++){
            int rand1 = (int)(Math.random()*(100 - 1 + 1) + 1); // for convenience
            int rand2 = (int)(Math.random()*(100 - 1 + 1) + 1); // I make random numbers from 1 to 100

            System.out.print("Guess from the random numbers: ");
            int guess = input.nextInt();

            if(guess==rand1 || guess ==rand2)
            {
                point++;
            }
            else
            {
                point=0;
            }
        }
        System.out.println("Points achieved: "+point);
    }
}
