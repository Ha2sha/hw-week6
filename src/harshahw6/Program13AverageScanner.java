package harshahw6;

import java.util.Scanner;

public class Program13AverageScanner {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        int a = obj.nextInt();
        System.out.println("Enter 2nd Number: ");
        int b = obj.nextInt();
        System.out.println("Enter 3rd Number: ");
        int c = obj.nextInt();
        int d = (a + b + c) / 3;
        System.out.println("The average of 3 numbers is: " + d);

    }
}
