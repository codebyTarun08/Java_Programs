import java.util.Scanner;

public class StudentPractice {
       public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number");
            int num=sc.nextInt();
            if(num%2==0){
                System.out.println("Even number");
            }
            else if(num%2==1){
                System.out.println("Odd number");
            }
            else{
                System.out.println("Undefined type of number");
            }

            System.out.println("Enter the age");
            int age=sc.nextInt();
            if(age>=18 && age <=25){
                System.out.println("Teenager");
            }
            else if(age>-25 && age<=35){
                System.out.println("Adult");
            }
            else if(age>-35 && age<=65){
                System.out.println("older");
            }

            System.out.println("Enter the Marks");
            int marks=sc.nextInt();

            if(marks>=80 && marks<=100){
                System.out.println('A');
            }
            else if(marks>=60 && marks<=80)
            {
                System.out.println('B');
            }
            else if(marks>=40 && marks<=60)
            {
                System.out.println('C');
            }
            else if(marks>=0 && marks<=40)
            {
                System.out.println('D');
            }
        }
       }    
}
