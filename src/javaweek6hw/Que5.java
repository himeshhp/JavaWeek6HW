package javaweek6hw;
/*Write a program for a calculator with addition, subtraction, multiplication and division
methods all with parameters and use string concatenation methods.
(Note: Two static and Two instance methods.)*/

import java.util.Scanner;

public class Que5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Enter number 1: ");
        a = sc.nextInt();
        System.out.print("Enter number 2: ");
        b = sc.nextInt();
        Que5 obj = new Que5();
        obj.add(a, b);
        obj.sub(a, b);
        mul(a, b);
        div(a, b);
        sc.close();
    }

    public void add(int a, int b) {
        int w;
        w = a + b;
        System.out.println("Addition of number 1 and number 2 is: " + w);
    }

    public void sub(int a, int b) {
        int x;
        x = a - b;
        System.out.println("Subtraction of number 1 and number 2 is: " + x);
    }

    public static void mul(int a, int b) {
        int y;
        y = a * b;
        System.out.println("Multiplication of number 1 and number 2 is: " + y);
    }

    public static void div(int a, int b) {
        int z;
        z = a / b;
        System.out.println("Division of number 1 and number 2 is: " + z);
    }
}
