package harshahw6;

public class Program5CalcWithParameters {

    //instance method
    public void addition(int a, int b, int c) {
        System.out.println("Addition Method");
        System.out.println("The addition of 3 numbers =" + (a + b + c));
        System.out.println("------------------------------------");
    }

    //instance method
    public void subtraction(int a, int b) {
        System.out.println("Subtraction Method");
        System.out.println("The subtraction of 2 numbers = " + (a - b));
        System.out.println("------------------------------------");
    }

    //static method
    public static void multiplication(int a, int b, int c) {
        System.out.println("Multiplication Method");
        System.out.println("The multiplication of 3 numbers = " + (a * b * c));
        System.out.println("------------------------------------");
    }

    //static method
    public static void division(int a, int b) {
        System.out.println("Division Method");
        System.out.println("The division of 2 numbers= " + (a / b));
        System.out.println("------------------------------------");
    }

    public static void main(String[] args) {
        Program5CalcWithParameters obj = new Program5CalcWithParameters();//object creation
        obj.addition(5, 4, 2);//calling instance method via object
        obj.subtraction(10, 5);//calling instance method via object
        multiplication(2, 5, 3);//calling static method directly
        division(100, 5);//calling static method directly

    }
}

