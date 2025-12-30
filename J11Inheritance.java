public class J11Inheritance {

    /* Java Inheritance (Subclass and Superclass)
    Inheritance allows a class to inherit attributes and methods
    from another class.
    The subclass (child) inherits from the supeclass (parent)
    using the 'extends' keyword.
    Example: */

    class Vehicle {
        protected String brand = "Ford";
        
        public void honk() {
            System.out.println("Tuut, tuut!");
        }
    }

    class Car extends Vehicle {
        private String modelName = "Mustang";
        
        public static void main(String [] args) {
            Car myCar = new Car();
            myCar.honk();
            System.out.println(myCar.brand + " " + myCar.modelName);
        }
    }
}