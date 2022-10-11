package javaweek6hw;

/*Write a Java program to print the sum (addition), multiply, subtract, divide and remainder
of two numbers.
Test Data: Input first number: 125
Input second number: 24
Expected Output : 125 + 24 = 149
                  125 - 24 = 101
                  125 x 24 = 3000
                  125 / 24 = 5
                  125 mod 24 = 5*/

public class Que18 {
    public static void main(String[] args) {
        int a = 125, b = 24, add, sub, mul, div, rem;
        add = a + b;
        System.out.println("Addition of a and b is: " + add);
        sub = a - b;
        System.out.println("Subtraction of a and b is: " + sub);
        mul = a * b;
        System.out.println("Multiplication of a and b is: " + mul);
        div = a / b;
        System.out.println("Division of a and b is: " + div);
        rem = a % b;
        System.out.println("Reminder of a and b is: " + rem);
    }
}
