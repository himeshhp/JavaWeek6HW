package javaweek6hw;
//Write a program to convert the upper case to lower case.

import java.util.Scanner;

public class Que9 {
    public static void main(String[] args) {
        String upCase;
        Scanner sc = new Scanner(System.in);
        sc = new Scanner(System.in);
        System.out.print("Enter UpperCase String ");
        upCase = sc.nextLine();
        String loCase = upCase.toLowerCase();
        System.out.println("Converts to LowerCase String " + loCase);
        sc.close();
    }
}

