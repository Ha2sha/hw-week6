package harshahw6;
import java.util.Scanner;//imports Scanner Class
public class Program9UpperToLowerScanner {

    public static void main(String[] args) {
        Scanner obj1=new Scanner(System.in);//object creation of Scanner class
        System.out.println("Enter text in UpperCase: ");
        String s1=obj1.nextLine(); //reads user input
        String s2=s1.toLowerCase();//converts user input to lowercase
        System.out.println("Output Conversion to LowerCase: \n"+s2);//output in lowercase as per user input
    }
}
