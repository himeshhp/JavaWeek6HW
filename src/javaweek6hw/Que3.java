package javaweek6hw;
/*Write a Java programme using the following steps.
3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the print statement.
3.5 Declare the Main method.
3.6 Call both instance and static methods into the Main method and run the programme.*/

public class Que3 {
    //3.1
    int a = 10;
    static int b = 20;

    //3.5
    public static void main(String[] args) {
        //3.6
        staticMethod();
    }

    //3.2
    public void instanceMethod() {
        //3.4
        System.out.println(a);
        System.out.println(b);
    }

    //3.3
    public static void staticMethod() {
        //3.4
        Que3 obj = new Que3();
        obj.instanceMethod();
        System.out.println(obj.a);
        System.out.println(Que3.b);
    }
}
