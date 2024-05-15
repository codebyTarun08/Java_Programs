import java.lang.*;
import java.util.Scanner;


class Quadratic_root
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int a,b,c;
  double r1,r2;
  
  System.out.println("Enter the coefficient of Quadratic equation:");
  a=sc.nextInt();
  b=sc.nextInt();
  c=sc.nextInt();


  r1=(-b+Math.sqrt(b*b-4*c*a))/(2*a);
  r2=(-b-Math.sqrt(b*b-4*c*a))/(2*a);

  System.out.println("r1:"+r1);
  System.out.println("r2:"+r2);
 }
}