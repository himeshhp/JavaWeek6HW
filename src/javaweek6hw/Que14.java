package javaweek6hw;

import java.util.Scanner;

/*Write a Java program to print the area and perimeter of a rectangle.
Test Data: Width = 5.5 Height = 8.5
Expected Output: Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20*/

public class Que14 {
    public static void main(String[] args) {
        double width, height, area, perimeter;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Width of Rectangle: ");
        width = sc.nextDouble();
        System.out.print("Enter Height of Rectangle: ");
        height = sc.nextDouble();
        area = width * height;
        System.out.println("Area of Rectangle= " + area);
        perimeter = (width + height) * 2;
        System.out.println("Perimeter of Rectangle= " + perimeter);
        sc.close();
    }
}
