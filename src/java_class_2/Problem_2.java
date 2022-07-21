/*2. Write a program to calculate GPA and find grade*/
package java_class_2;

import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" ----- Course Names ----- ");
        int course[] = new int[10];
        double gpa = 0;
        double total_gpa = 0;
        int total_credit = 12; // 4 courses, 3 credit each courses. So, total credit = (4*3) = 12
        String grade;
        System.out.print("Course 1 (C programming - 3 credits): ");
        course[0] = input.nextInt();
        System.out.print("Course 2 (JAVA programming - 3 credits): ");
        course[1] = input.nextInt();
        System.out.print("Course 3 (Data Structures - 3 credits): ");
        course[2] = input.nextInt();
        System.out.print("Course 4 (Algorithm - 3 credits): ");
        course[3] = input.nextInt();

        System.out.println(" ----- GRADE SHEET ----- ");
        for(int i=0;i<=3;i++)
        {
            if (course[i] >= 80 && course[i] <= 100) {
                gpa = 4.0;
                grade = "A+";
            } else if (course[i] >= 75 && course[i] < 80) {
                gpa = 3.75;
                grade = "A";
            } else if (course[i] >= 70 && course[i] < 75) {
                gpa = 3.50;
                grade = "A-";
            } else if (course[i] >= 65 && course[i] < 70) {
                gpa = 3.25;
                grade = "B+";
            } else if (course[i] >= 60 && course[i] < 65) {
                gpa = 3.00;
                grade = "B";
            } else if (course[i] >= 55 && course[i] < 60) {
                gpa = 2.75;
                grade = "C+";
            } else if (course[i] >= 50 && course[i] < 55) {
                gpa = 2.50;
                grade = "C";
            } else if (course[i] >= 40 && course[i] < 50) {
                gpa = 2.25;
                grade = "D";
            } else {
                gpa = 0.00;
                grade = "F";
            }
            total_gpa += (gpa*3); // multiply by credit hours
            System.out.println("Course "+(i+1)+"--- Mark: "+course[i] + " - GPA: "+gpa+" - Grade: "+grade);
        }
        System.out.println("Final CGPA : "+(total_gpa/total_credit));
    }
}
