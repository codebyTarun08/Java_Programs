import java.io.*;
import java.util.*;


class Calculator
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the a And b:");
 
  float a,b;
  a=sc.nextFloat();
  b=sc.nextFloat();
 
  System.out.println("a+b:"+(a+b));
  System.out.println("a-b:"+(a-b));
  System.out.println("a*b:"+(a*b));
  System.out.println("a/b:"+(a/b));
  System.out.println("a%b:"+(a%b));
 }
}