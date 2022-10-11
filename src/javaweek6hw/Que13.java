package javaweek6hw;

import java.util.Scanner;

/*Write a Java program that takes three numbers as input
to calculate and print the average of the numbers.*/

public class Que13 {
    public static void main(String[] args) {
        int a, b, c, sum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        a = sc.nextInt();
        System.out.print("Enter number 2: ");
        b = sc.nextInt();
        System.out.print("Enter number 3: ");
        c = sc.nextInt();
        sum = a + b + c;
        System.out.println("Sum of all 3 numbers= " + sum);
        double avg = sum / 3;
        System.out.println("Average of all 3 numbers= " + avg);
        sc.close();
    }
}
