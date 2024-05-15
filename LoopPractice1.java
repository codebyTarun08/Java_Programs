import java.util.Scanner;

class Task1 {
    public void displayDigits()
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter number to display digits");
       int num=sc.nextInt();
       int remainder;
       int c=0;
       while(num>0)
       {
        remainder=num%10;
        System.out.println(remainder);
        num=num/10;
        c++;
       }
       System.out.println("count of digits:"+ c);
    }
}

class Task2 {
    public void armstrong()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number to check Armstrong");
      int num=sc.nextInt();
      int r;
      int copy_num=num;
      int new_num=0;
      while(num>0)
      {
        r=num%10;
        r=r*r*r;
        System.out.println(r);
        new_num=new_num+ r;
        num=num/10;
      }
      if(new_num==copy_num)
      {
        System.out.println(copy_num + "  is Armstrong");
      }
      else{
        System.out.println(copy_num + "is not Armstrong");
      }
    }
}

class Task3 {
    public void pallindrome()
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number to check pallindrome");
    int num=sc.nextInt();
    int r;
    int copy_num=num;
    int rev=0;
    while (num>0)
    {
        r=num%10;
        rev=rev*10+r;
        num=num/10;
    }
    System.out.println("Reverse no.:"+rev);  
    if(rev==copy_num){
        System.out.println("Pallindrome");
    }
    else{
        System.out.println("Not Pallindrome");
    }
    }

}

class Task4{
  public void display(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number");
    int x=sc.nextInt();
    int rev=0;
    int r;  
    int count=0;
    while(x>0)
    {
      r=x%10;
      rev=rev*10+r;
      x=x/10;
      count++;
    }
   for(int i=0;i<count;i++)
   {
    r= rev%10;
    rev=rev/10;
    switch(r){
      case 0:
         System.out.print("Zero ");
         break;
      case 1:
         System.out.print("One ");
         break;
      case 2:
         System.out.print("Two ");
         break;
      case 3:
         System.out.print("Three ");
         break;
      case 4:
         System.out.print("Four ");
         break;
      case 5:
         System.out.print("Five ");
         break;
      case 6:
         System.out.print("Six ");
         break;
      case 7:
         System.out.print("Seven ");
         break;
      case 8:
         System.out.print("Eight ");
         break;
      case 9:
         System.out.print("Nine ");
         break;
      
      default:
         System.out.println("Invalid input");
         break;
    }
   }
  }
}


class AlternateTask4{
  public void displayDigitInWords(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number");
    int x=sc.nextInt();
    int r;
    int rev=0;
    String str="";
    while(x>0){
      r=x%10;
      x=x/10;
      str=str+r;
    }
    System.out.println(str);
    for(int i=str.length()-1;i>=0;i--){
      char c;
      c=str.charAt(i);
      switch(c){
        case '0':
           System.out.println("Zero");
           break;
        case '1':
           System.out.println("one");
           break;
        case '2':
           System.out.println("Two");
           break;
        case '3':
           System.out.println("Three");
           break;
        case '4':
           System.out.println("Four");
           break;
        case '5':
           System.out.println("Five");
           break;
        case '6':
           System.out.println("Six");
           break;
        case '7':
           System.out.println("Seven");
           break;
        case '8':
           System.out.println("Eight");
           break;
        case '9':
           System.out.println("Nine");
           break;
        default:
           System.out.println("Invalid Input");
           break;
      }
    }
  }
}

class Task5{
  public void fibonacci(){
    Scanner sc=new Scanner(System.in);
    int nth,n1,n2;
    System.out.println("Enter the no. of terms");
    int n=sc.nextInt();
    n1=0;
    n2=1;
    System.out.print(n1 + " ");
    System.out.print(n2 + " ");
    for(int i=3;i<=n;i++)
    {
      nth=n1+n2;
      System.out.print(nth + " ");
      n1=n2;
      n2=nth;

    }
  }
}

class Task6{
  public void arithmeticProgression(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first term");
    float a=sc.nextFloat();

    System.out.println("Enter Common Difference");
    float d=sc.nextFloat();

    System.out.println(" Enter the Terms of A.P. Series");
    int n=sc.nextInt();

    for(int i=1;i<=n;i++){
      System.out.print(a+" ,");
      a=a+d;
    }
  }
}
class Task7{
  public void geometricProgression(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first term");
    float a=sc.nextFloat();

    System.out.println("Enter Common ratio");
    float d=sc.nextFloat();

    System.out.println(" Enter the Terms of A.P. Series");
    int n=sc.nextInt();

    for(int i=1;i<=n;i++){
      System.out.print(a+" ,");
      a=a*d;
    }
  }
}
public class LoopPractice1 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("1.Task1");
    System.out.println("2.Task2");
    System.out.println("3.Task3");
    System.out.println("4.Task4");
    System.out.println("5.AlternateTask4");
    System.out.println("6.fibonacci");
    System.out.println("7.A.p. Series");
    System.out.println("8.G.p. Series");
    int option;
    option=sc.nextInt();
    switch(option){
      case 1:
        Task1 t1=new Task1();
        t1.displayDigits();
        break;
      case 2:
        Task2 t2=new Task2();
        t2.armstrong();
        break;
      case 3:
        Task3 t3=new Task3();
        t3.pallindrome();
        break;
      case 4:
        Task4 t4=new Task4();
        t4.display();
        break;
      case 5:
        AlternateTask4 t5=new AlternateTask4();
        t5.displayDigitInWords();
        break;
      case 6:
        Task5 t6=new Task5();
        t6.fibonacci();
        break;
      case 7:
        Task6 t7=new Task6();
        t7.arithmeticProgression();
        break;
      case 8:
        Task7 t8=new Task7();
        t8.geometricProgression();
        break;
      default:
        System.out.println("invalid Choice") ;
        break; 
    }  
   }
}