package harshahw6;

public class Program1InstanceVarMethod {
    int a = 22; //instance variable
    String name = "Hello";//instance variable

    //instance method
    public void print() {
        System.out.println("a= " + a);//a= 22
        System.out.println("Name= " + name);// name= Hello
    }

    public static void main(String[] args) {
        Program1InstanceVarMethod p1 = new Program1InstanceVarMethod();//object creation
        p1.print();//calling instance method via object
    }

}
