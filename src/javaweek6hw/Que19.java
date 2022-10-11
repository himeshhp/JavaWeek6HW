package javaweek6hw;

/*Write a Java program to convert a given string into lowercase.
Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
Output: the quick brown fox jumps over the lazy dog.*/

public class Que19 {
    public static void main(String[] args) {
        String a = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG", b;
        b = a.toLowerCase();
        System.out.println("Converts to LowerCase String: " + b);
    }
}
