public class Print {
    public static void main(String[] args)
    {
        int x=10,y=20;
        float f=10.2f;
        double db=457.98D;
        boolean b=true;
        String str="Printing Method";     

        System.out.print(x); //Printing in one line
        System.out.println(y); //printing in more line and started with new line
        System.out.printf("ans:%f\n",f); //printf is used as use in C
        System.out.printf("ans:%e\n",db);// Format specifier of double is same as float,
        System.out.printf("ans:%f\n",db);// but if in scientific representation %e is used.
        System.out.format("ans:%b\n",b);// Format specifier of boolean is %b.
        System.out.print(b);
        System.out.printf("\n%s",str);//Format specifier of boolean is %b
        System.out.printf(str);//also we can use this type.
        System.out.printf("%g",f);
        System.out.println(x+y+"Sum");//+ is use for concatenation of string.Operation are done from left to right
        System.out.println("Sum"+x+y);//So the output will be different first output is 30Sum and second is Sum1020.
    }
}
