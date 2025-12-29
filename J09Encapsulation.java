public class J09Encapsulation {

    private String name; // private = restricted access

    /* Encapsulation
    Encapsulation is the practice of hiding sensitive data.
    This is done by making class attributes private and providing
    public getter and setter methods to access and update those
    attributes safely. */

    /* Get and Set
    Private variables cannot be accessed outside their class.
    To access them safely, public getter and setter methods are used.
    Get methods return the variable value, while set methods update
    the variable value.
    Example: */

    //Getter
    public String getName() {
        return name;
    }
    
    //Setter
    public void setName (String newName) {
        this.name = newName;
    }

    /* Explanation
    The 'get' method returns the value of the variable 'name'.
    The 'set' method takes a parameter (newName) and assigns it to the 'name'
    variable. The 'this' keyword is used to refer to the current object.
    However, as the 'name' variable is declared as 'private', we cannot access
    it from outside this class. */

    /*
    public class Main {
        public static void main(String [] args){
            Person myObj = new Person ();
            myObj.name = "John"; <-- error
            System.out.println(myObj.name); <-- error
        }
    } */

    public static void main(String[] args){
        Person myObj = new Person();
        myObj.setName("John");
        System.out.println(myObj.getName());
    }
}   
