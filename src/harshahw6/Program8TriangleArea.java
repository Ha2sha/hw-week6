package harshahw6;

public class Program8TriangleArea {

    //instance class
    public void areaTriangle(double b, double h) {
        double area;//local variable
        area = (b * h) / 2;
        System.out.println("The area of Triangle is: " + area);
    }

    public static void main(String[] args) {
        Program8TriangleArea obj = new Program8TriangleArea();//object creation to call instance method
        obj.areaTriangle(20.5, 10);
    }
}
