package harshahw6;

import java.util.Scanner;//imports Scanner class

public class Program10MultiTableScanner {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);//creates scanner class object
        System.out.println("Test Data: ");//Test Data:
        int num1 = obj.nextInt();//reads user input
        System.out.println("Expected output:");//Expected output:

        for (int i = 0; i <= 10; i++) {
            System.out.println(num1 + " x " + (i + 1) + " = " + num1 * (i + 1));//print multiplication tables based on user input
        }

    }
}
