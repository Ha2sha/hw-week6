package harshahw6;

public class Program3MixInstanceStatic {
    int a = 35;//instance variable
    static String name = "Good Morning";//static variable

    //instance method
    public void print() {
        System.out.println("Calling instance method in Main method via object");
        System.out.println("a= " + a);//a=35
        System.out.println("Name= " + Program3MixInstanceStatic.name);//name=Good Morning (calling static variable via class)
    }

    //static method
    public static void print2() {
        System.out.println("Calling static method in Main method directly");
        Program3MixInstanceStatic obj = new Program3MixInstanceStatic();//object creation for calling instance variable 'a'
        System.out.println("a= " + obj.a);//a=35
        System.out.println("Name= " + name);//name=Good Morning
    }

    public static void main(String[] args) {
        Program3MixInstanceStatic obj1 = new Program3MixInstanceStatic();
        obj1.print();//calling instance method via object
        System.out.println("-------------------------------------");
        print2(); //calling static method directly

    }
}
