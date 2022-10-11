package javaweek6hw;
/*Write a Java program to convert a decimal number to binary number.
Input Data: Input a Decimal Number : 5
            Expected Output Binary number is: 101*/

import java.util.Scanner;

public class Que17 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Decimal number: ");
        a = sc.nextInt();
        System.out.println("Binary number of " + a + " is " + Integer.toBinaryString(a));
        sc.close();
    }

}
