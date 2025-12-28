public class J08NonAccessModifiers {

    /* Non-Access Modifiers
    Non-access modifiers do not control visibility.
    Instead, they add special behavior to classes, methods, or attributes,
    such as final, static and abstract. */

    /* Final
    The 'final' modifier is used when you want to prevent an attribute
    from being changed after it is initialized. */

    final int x = 10;
    final double PI = 3.14;

    /* Static
    A static method belongs to the class, not to a specific object.
    This means it can be called without creating an instance of the class. */

    static void myStaticMethod(){
        System.out.println("Static methods can be called without creating objects");
    }

    public static void main(String[] args) {
        J08NonAccessModifiers myObj = new J08NonAccessModifiers();
        myObj.x = 50; // error: cannot assign a value to final variable x
        myObj.PI = 25; // error: cannot assign a value to final variable PI
        System.out.println(myObj.x);

        myStaticMethod();
    }
}