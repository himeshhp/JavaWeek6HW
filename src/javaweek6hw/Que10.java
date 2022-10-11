package javaweek6hw;
/*Write a Java program that takes a number as input and prints its
multiplication table up to 10.
Test Data: Input a number: 8
Expected Output : 8 x 1 = 8
                  8 x 2 = 16
                  8 x 3 = 24
                  ...
                  8 x 10 = 80*/

import java.util.Scanner;

public class Que10 {
    public static void main(String[] args) {
        int a, b, c, d, e, f, g, h, i, j, k;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of which table you want: ");
        k = sc.nextInt();
        a = k * 1;
        System.out.println(k + " * 1 =  " + a);
        b = k * 2;
        System.out.println(k + " * 2 =  " + b);
        c = k * 3;
        System.out.println(k + " * 3 =  " + c);
        d = k * 4;
        System.out.println(k + " * 4 =  " + d);
        e = k * 5;
        System.out.println(k + " * 5 =  " + e);
        f = k * 6;
        System.out.println(k + " * 6 =  " + f);
        g = k * 7;
        System.out.println(k + " * 7 =  " + g);
        h = k * 8;
        System.out.println(k + " * 8 =  " + h);
        i = k * 9;
        System.out.println(k + " * 9 =  " + i);
        j = k * 10;
        System.out.println(k + " * 10 = " + j);
        sc.close();
    }

}
