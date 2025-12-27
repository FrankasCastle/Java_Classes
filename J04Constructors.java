public class J04Constructors {

    /* Java Constructors
    A constructor is a special method used to initialize objects.
    It is automatcally called when an object is created and is used
    to set initial values for the object's attributes. */

    int x;

    /* Constructors Parameters
    Constructors can receive parameters to initializa object attributes.
    When the constructor is called, the provided values are assigned to 
    the corresponding attributes of the object.
    Example:  */

    public J04Constructors(int y){
        x = y;
    }

    public static void main (String [] args){
        J04Constructors myObj = new J04Constructors(5);
        System.out.println(myObj.x);
    }
}