package harshahw6;

import java.util.Scanner;

public class Program6CircleAreaScanner {
    double r;

    public static void area() {
        Scanner s = new Scanner(System.in);// creates object of Scanner class
        System.out.println("Enter the radius:");
        double r = s.nextDouble(); //Read user input
        double area = (22 * r * r) / 7;
        System.out.println("Area of Circle is: " + area);//output based on user input
    }

    public static void main(String[] args) {
        area(); //calling of static method directly
    }
}
