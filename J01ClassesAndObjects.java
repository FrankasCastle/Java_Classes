public class J01ClassesAndObjects {

    /* Java Classes and Objects
    Java is an object-oriented programming language.
    Everything in Java is based on classes and objects, which
    contain attributes (variables) and methods. */

    /* Creating a Class
    A class works as a blueprint for creating objects.
    To create a class, use the 'class keyword'.*/

    /* Creating an Object
    An object in Java is created from a class. After defining a 
    class, you can create objects by using the class name together
    with the 'new' keyword. 
    Example: */

    int x = 5;

    public static void main(String[] args) {
        J01ClassesAndObjects myObj = new J01ClassesAndObjects();
        System.out.println(myObj.x);

        // We can also create multiple objects of one class.

        J01ClassesAndObjects myObj1 = new J01ClassesAndObjects();
        J01ClassesAndObjects myObj2 = new J01ClassesAndObjects();
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);

        /* Using Multiple Classes
        We can create an object of one class and use it inside another
        class. This helps organize the code by separating responsibilites,
        such as keeping attributes and methods in one class and the main()
        method in another. The Java file name must match the class name. */

    }
}