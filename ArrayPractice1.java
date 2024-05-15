import java.util.*;
public class ArrayPractice1 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int A[]= {2,7,4,8,5};
        System.out.println("1.Sum of all elements");
        System.out.println("1.Searching the element");
        int option=scan.nextInt();
        switch(option){
           case 1:
              int sum=0;
              for(int i=0;i<A.length;i++){
                sum=sum+A[i];
              }
              System.out.println("Sum of all elements "+ sum);
              break;
            case 2:
              System.out.println("Enter the search element");
              int value =scan.nextInt();
              for(int i=0;i<A.length;i++){
                if(value==A[i])
                    System.out.println("Element" + value + " is found at" + i );
                else
                  System.out.println("Element " + value + "is not found.");
              }
              break;
            case 3:
              int x = A[0];
              for(int i=1;i<A.length;i++){
                if(A[i]>x){
                    x=A[i];
                }
              }
              System.out.println("Max:"+ x);
              break;
              
        }
    }
}
