package javaweek6hw;
/*Write a Java programme using the following steps.
4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme.*/

public class Que4 {
    //4.1
    int a = 10;
    int b = 20;
    static int c = 30;
    static int d = 40;

    //4.5
    public static void main(String[] args) {
        //4.6
        Que4 objc = new Que4();
        objc.instanceMethod();
        staticMethod();
    }

    //4.2
    public void instanceMethod() {
        //4.4
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

    //4.3
    public static void staticMethod() {
        Que4 objt = new Que4();
        System.out.println(objt.a);
        System.out.println(objt.b);
        System.out.println(c);
        System.out.println(d);
    }
}
