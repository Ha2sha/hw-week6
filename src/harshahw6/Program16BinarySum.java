package harshahw6;

public class Program16BinarySum {

    public static void main(String[] args) {

        int b1 = Integer.parseInt("10", 2);//convert string/binary to int
        int b2 = Integer.parseInt("11", 2);//convert string/binary to int
        int sum = b1 + b2;
        String sum1 = Integer.toBinaryString(sum);//convert int to binary/string
        System.out.println("sum of two binary numbers: " + sum1);//101
    }
}
