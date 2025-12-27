public class J03ClassMethods {

    /* Java Class Methods
    Methods declared inside a class define actions that the
    class can perform. They are used to describer the behavior
    of objects created from the class. */

    static void myMethod() {
        System.out.println("Hello World!");        
    }

    // Access Methods With an Object

    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }

    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }

    public static void main (String[] args) {
        myMethod();

        J03ClassMethods myCar = new J03ClassMethods();
        myCar.fullThrottle();
        myCar.speed(200);
    }
}