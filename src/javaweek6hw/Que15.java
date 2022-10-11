package javaweek6hw;

import java.util.Scanner;

/*Write a Java program to swap two variables.*/

public class Que15 {
    public static void main(String[] args) {
        String name, lastname, swap;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        System.out.print("Enter your last name: ");
        lastname = sc.nextLine();
        System.out.println("Name " + name + " LastName " + lastname);
        swap = name;
        name = lastname;
        lastname = swap;
        System.out.println("After swap FullName: " + name + " " + lastname);
        sc.close();
    }
}
