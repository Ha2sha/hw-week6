package harshahw6;

public class Program4MixInstanceStatic {
    int a = 45;//instance variable
    float b = 50.6f;//instance variable

    static String name = "Java is fun";//static variable
    static double c = 12.56;//static variable

    //instance method
    public void print() {
        System.out.println("Calling instance method in Main method via object");
        System.out.println("a= " + a);//a=45
        System.out.println("b= " + b);//b=50.6
        System.out.println("name =" + Program4MixInstanceStatic.name);// name = Java is fun
        System.out.println("c= " + Program4MixInstanceStatic.c);//c=12.56
    }

    //static method
    public static void print1() {
        System.out.println("Calling static method in Main method directly");
        Program4MixInstanceStatic obj = new Program4MixInstanceStatic();//object creation to call instance variable
        System.out.println("a= " + obj.a);//a=45;
        System.out.println("b= " + obj.b);//b=50.6
        System.out.println("name =" + name);//name = Java is fun
        System.out.println("c= " + c);//c=12.56
    }

    public static void main(String[] args) {
        Program4MixInstanceStatic obj1 = new Program4MixInstanceStatic();//object creation to call instance method
        obj1.print();//calling instance method via object
        System.out.println("----------------------------------------------------");
        print1();//calling static method directly as both methods are static
    }
}
