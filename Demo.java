import java.lang.*;
import java.util.Scanner;

class Demo{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float length,breath;
        float area;
        System.out.printf("Enter length:\n");
        length=sc.nextFloat();
        System.out.printf("Enter breadth:\n");
        breath=sc.nextFloat();
        area=length*breath;
        System.out.print("Area is:"+ area);
    }
}