package javaweek6hw;
/*Write a program to enter any radius value of the circle and find out the area.
(Formula of Area A=PI*r*r).*/

import java.util.Scanner;

public class Que6 {
    public static void main(String[] args) {
        int r;
        double pi = 3.14, area;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter radius of circle:");
        r = s.nextInt();
        area = pi * r * r;
        System.out.println("Area of circle:" + area);
        s.close();
    }
}
