import java.util.Scanner;

class MenuDriven{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,choice;
        System.out.println("1.Addition of 2 numbers.");
        System.out.println("2.Swapping of 2 numbers.");
        System.out.println("3.Check given number is prime or not.");

        System.out.print("Enter the choice:");
        choice=sc.nextInt();

        switch (choice) {
            case 1:
                int c;
                System.out.println("Enter the numbers for addition:");
                a=sc.nextInt();
                b=sc.nextInt();
                c=a+b;
                System.out.println("Addition of  " + a + " and " + b + " is: " +c);
                break;
            case 2:
                int temp;
                System.out.println("Enter the numbers for swapping:");
                a=sc.nextInt();
                b=sc.nextInt();
                temp=b;
                b=a;
                a=temp;
                System.out.println("Values after swapping:");
                System.out.println(a);
                System.out.println(b);
                break;
            case 3:
                int num;
                System.out.print("Enter number to check prime or not:");
                num=sc.nextInt();
                if(num==1)
                {
                    System.out.println("num is not prime");
                    break;
                }
                for(int i=2;i<num;i++)
                {
                    if(num % i==0)
                    {
                        System.out.print("num is not prime");
                        return;
                    }
                }
                System.out.println("num is prime."); 
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }
}