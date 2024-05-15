import java.lang.*;
import java.util.Scanner;



class Areatriangle
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int a,b,c;
  double area;
  double s;
 
  System.out.println("Enter the sides of Triangle:");
  a=sc.nextInt();
  b=sc.nextInt();
  c=sc.nextInt();

  System.out.println("Method 1:");
  area=(a*b)/2;
  System.out.println(area);

  System.out.println("Metrhod 2:");
  s=(a+b+c)/2f;
  area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
  System.out.println(area);
 } 
}
