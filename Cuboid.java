import java.lang.*;
import java.util.Scanner;

class Cuboid
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   float a,b,c;
   System.out.println("Enter the sides of Cuboid:");
   System.out.println("Enter Length:");
   a=sc.nextFloat();
   System.out.println("Enter breadth:");
   b=sc.nextFloat();
   System.out.println("Enter height:");
   c=sc.nextFloat();

   float Area,Volume;
   Area= 2*(a*b+b*c+c*a);
  
   Volume=a*b*c;
   System.out.println("Volume is:"+Volume);
   System.out.println("Total Area of Cuboid is:"+Area);
  }
}