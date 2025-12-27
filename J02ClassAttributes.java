public class J02ClassAttributes {

    /* Class Attributes
    Class Attributes are variables that belong to a class. In previous
    examples, what we called a variable is actually an attribute
    of the class. */

    int x = 5;
    String fname = "Mariana";
    String lname = "Sena";
    int age = 27;

    // That is actually an attribute.

    /* Accessing Attributes
    Class attributes can be accessed by creating an object of the class
    and using the dot (.) syntax to refer to the attribute.
    This allow you to read or use the attribute's value.
    Example:  */

    public static void main(String[] args) {
        J02ClassAttributes myObj = new J02ClassAttributes();
        System.out.println(myObj.x);

        // We can also modify attribute values:

        myObj.x = 40;
        System.out.println(myObj.x);

        /* If you don't want the ability to override existing values,
        declare the attribute as 'final'. */

        /* Multiple Objects
        We can create multiple objects from the same class.
        Each object has its own copy of the attributes, so changing
        one object does not affect the others. */

        J02ClassAttributes myObj1 = new J02ClassAttributes();
        J02ClassAttributes myObj2 = new J02ClassAttributes();
        myObj2.x = 25;
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
        
        // We can specify as many attributes as we want:

        J02ClassAttributes myObj3 = new J02ClassAttributes();
        System.out.println("Name: " + myObj3.fname + " " + myObj3.lname);
        System.out.println("Age: " + myObj3.age);
    }
}