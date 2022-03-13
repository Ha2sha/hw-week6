package harshahw6;

public class Program14RectAreaPerimeter {
    float width = 5.6f;//instance variable
    float height = 8.5f;//instance variable
    float area;//instance variable
    float periMeter;//instance variable

    //Instance Method
    public void area() {
        area = width * height;
        System.out.println("Area is 5.6 * 8.5 = " + area);//47.6
    }

    //Instance Method
    public void periMeter() {
        periMeter = 2 * (width + height);
        System.out.println("Perimeter is 2 * (5.6 + 8.5) = " + periMeter);//28.2
    }

    public static void main(String[] args) {
        Program14RectAreaPerimeter obj = new Program14RectAreaPerimeter();//object creation
        obj.area();//calling instance method via object
        obj.periMeter();//calling instance method via object
    }
}
