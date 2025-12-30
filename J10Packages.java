import java.util.Scanner;

public class J10Packages {

    /* Packages & API
    A package is used to group related classes together.
    It works like a folder in a file system and helps avoid name conflicts and
    improve code organization.
    Packages can be built-it or user-defined. */

    /* Import a Class
    To use a class from a package, you must import it first.
    For example, the Scanner class is used to read user imput.
    The package cointains the class, and importing it allow you
    to create objects and use its available methods.
    Example (the Scanner class was imported at the beginning so
    it can be used in the code below.): */

    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");

        String userName = myObj.nextline();
        System.out.println("Username is: " + userName);
    }
}