public class J05Keywordthis {

    /* Java this Keyword
    The 'this' keyword refers to the current object.
    It is commonly used to distinguish class attributes from
    parameters or variables with the same name. */

    /* Accessing Class Attributes
    When a method or a constructor parameter has the same name as
    a class attribute, the parameter hides the attribute.
    Use the 'this' keyword to refer to the class attribute. 
    Example: */

    int x;

    public J05Keywordthis(int x) {
        this.x = x;
    }

    public static void main(String[] args) {
        J05Keywordthis myObj = new J05Keywordthis(5);
        System.out.println("Value of x = " + myObj.x);
 
        /* Calling a Constructor from Another Constructor
        We can use this() to call another constructor in the same class. 
        This helps reuse initialization code and set default values 
        without repeating logic.
        Example: (J06thisExample) */
   

    }
}