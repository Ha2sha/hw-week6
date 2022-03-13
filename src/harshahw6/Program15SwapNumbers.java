package harshahw6;

public class Program15SwapNumbers {
    static int a = 108;//static variable
    static int b = 999;//static variable

    //Static Method
    public static void swapMethod() {
        int c;//local variable
        System.out.println("Before Swapping values are: a=108 & b=999");
        c = a;
        a = b;
        b = c;
        System.out.println("After Swapping values are: a=999 & b=108");
    }

    public static void main(String[] args) {
        swapMethod();//calling static method directly
    }
}
