package harshahw6;

import java.util.Scanner;//imports Scanner Class

public class Program7TempFtoCScanner {

    public static void main(String[] args) {
        float fahrenheit, celsius;
        Scanner s1 = new Scanner(System.in);//Create objects of Scanner Class
        System.out.println("Enter temperature in degree Fahrenheit: ");
        fahrenheit = s1.nextFloat();//reads user input
        celsius = ((fahrenheit - 32) * 5) / 9;
        System.out.println("Temperature in Celsius is: " + celsius);//output based on user input
    }
}
