/* Modifiers
Modifiers define the access level or behavior of classes,
attributes, methods, and constructors.
The 'public' keyword is an acceess modifier that controls visibility.
Modifiers are divided into access modifiers and non-access modifiers. */

/* Access Modifiers
Classes
For classes, we can use either 'public' or 'default':
 public: The class is accessible by any other class.
 default: The class is only accessible by classes in same package.
 This is used when you don't specify a modifier.
    
For attributes, methods and constructors, we can use the one of the following.
    
public: The code is accessible for all classes.
private: The code is only accessible within the declared class.
default: The code is only accessible in the same package.
protected: The code is accessible in the same package and subclasses.*/

/* Public vs. Private Example 
A class can have public and private attributes.
Public attributes can be accessed from anywhere, while private attributes
 are restricted and can only be accessed within the class itself.
Example: */

class Person{
    public String name = "John"; // Public - Accessible everywhere
    private int age = 30; // Private - only accessible inside this class
}

public class J07Modifiers {
    public static void main(String[] args){
        Person p = new Person();
        System.out.println(p.name);
        System.out.println(p.age); // would result in an error, because
        // age has private access in Person.
    }
}