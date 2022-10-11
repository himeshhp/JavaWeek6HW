package javaweek6hw;
/*Write a program to insert any temperature value in degree Fahrenheit
and convert to degree Celsius ((F − 32) × 5/9 = 0°C).*/

import java.util.Scanner;

public class Que7 {

    public static void main(String[] Strings) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input degree in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        double celsius = ((fahrenheit - 32) * 5) / 9;
        System.out.println(fahrenheit + "'F = " + celsius + "'C");
        sc.close();
    }
}

