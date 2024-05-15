import java.lang.*;

class Expression
{
    public static void main(String args[])
    {
     int a,b;
     float c,z;
     a=10;
     b=6;
     c=a+b/2;
     z=(a+b)/2f;
     System.out.println(c);
     System.out.println(z);
     c=a/b;
     z=a%b;
     System.out.println(c);
     System.out.println(z);

     byte p=10;
     short q=5;
     
     int r = p+q;
     System.out.println(r);
     
     char t = 40;
     int  u=30;
     int v=t-u;
     System.out.println(v);
    }
}