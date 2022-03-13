package harshahw6;

import java.util.Scanner;// imports Scanner class

public class Program5CalcScanner {
    //instance method
    public void addition() {
        System.out.println("Addition Method");
        Scanner myObj = new Scanner(System.in); //create a scanner object
        System.out.println("Enter 1st Number: ");
        int a = myObj.nextInt();// Read user input
        System.out.println("Enter 2nd float Number: ");
        float b = myObj.nextFloat();// Read user input
        System.out.println("The addition of a and b=" + (a + b));// Output user input
        System.out.println("------------------------------------");
    }

    //instance method
    public void subtraction() {
        System.out.println("Subtraction Method");
        Scanner myObj = new Scanner(System.in); //create a scanner object
        System.out.println("Enter 1st Number: ");
        int a = myObj.nextInt();// Read user input
        System.out.println("Enter 2nd float Number: ");
        float b = myObj.nextFloat();// Read user input
        System.out.println("The subtraction of a and b = " + (a - b));// Output user input
        System.out.println("------------------------------------");
    }

    //static method
    public static void multiplication() {
        System.out.println("Multiplication Method");
        Scanner myObj = new Scanner(System.in); //create a scanner object
        System.out.println("Enter 1st Number: ");
        int a = myObj.nextInt();// Read user input
        System.out.println("Enter 2nd float Number: ");
        float b = myObj.nextFloat();// Read user input
        System.out.println("The multiplication of a and b = " + (a * b));// Output user input
        System.out.println("------------------------------------");
    }

    //static method
    public static void division() {
        System.out.println("Division Method");
        Scanner myObj = new Scanner(System.in); //create a scanner object
        System.out.println("Enter 1st Number: ");
        int a = myObj.nextInt();// Read user input
        System.out.println("Enter 2nd float Number: ");
        float b = myObj.nextFloat();// Read user input
        System.out.println("The division of a by b= " + (a / b));// Output user input
        System.out.println("------------------------------------");
    }

    public static void main(String[] args) {

        Program5CalcScanner obj = new Program5CalcScanner(); //object creation
        obj.addition();//calling instance method via object
        obj.subtraction();//calling instance method via object
        multiplication();//calling static method directly
        division();//calling static method directly

    }
}
