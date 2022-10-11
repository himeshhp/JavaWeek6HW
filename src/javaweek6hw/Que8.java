package javaweek6hw;
//Write a program to calculate the area of a triangle.

import java.util.Scanner;

public class Que8 {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        System.out.println("Enter base of triangle:");
        double base = sn.nextDouble();
        System.out.println("Enter vertical height of triangle:");
        double verticalHeight = sn.nextDouble();
        Que8 at = new Que8();
        double area = at.calculateArea(base, verticalHeight);
        System.out.println("Area of Triangle is " + area);
        sn.close();
    }

    double calculateArea(double base, double verticalHeight) {
        return base * verticalHeight / 2;
    }
}
