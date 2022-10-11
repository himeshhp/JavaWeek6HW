package javaweek6hw;
/*Write a Java programme using the following steps.
1.1 Declare two instance variables.
1.2 Declare one instance method.
1.3 Call both instance variables into the instance method inside the print statement.
1.4 Declare the Main method.
1.5 Call the above instance method into the Main method and Run the programme.*/

public class Que1 {
    //1.1
    int a = 10;
    int b = 20;

    //1.4
    public static void main(String[] args) {
        //1.5
        Que1 obj = new Que1();
        obj.instanceMethod();
    }

    //1.2
    public void instanceMethod() {
        //1.3
        System.out.println(a);
        System.out.println(b);
    }
}
