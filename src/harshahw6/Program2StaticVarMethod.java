package harshahw6;

public class Program2StaticVarMethod {
    static int a = 25;//static variable
    static String name = "My name is Harsha";//static variable

    //static method
    public static void print() {
        System.out.println("a= " + a);//a= 25
        System.out.println("Hi! " + name);//Hi! My name is Harsha
    }

    public static void main(String[] args) {
        print();//calls method directly as both are static methods
    }
}
