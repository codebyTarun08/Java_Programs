import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

class Student{
    String name;
    int roll_no;
    int inputAge;

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Roll No. : " + roll_no);
        System.out.println("Age: " + calculate());
    }

    public int calculate(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the  date-of-birth(YYYY-MM-DD): ");
        String dob_String = scan.nextLine();
        
        LocalDate dob = LocalDate.parse(dob_String);

        LocalDate presentDate = LocalDate.now();
        Period age = Period.between(dob,presentDate);

        System.out.println("Age is:  " + age.getYears() + "  Years  " + age.getMonths() + "  Months  "  + age.getDays() + "  Days");
        scan.close();

        if(age.getYears() == inputAge)
            return inputAge;
        else
            System.out.println("Incorrect age");
      return 0;  
    }
}

public class Profile {
    public static void main(String[] args){
     Scanner scan=new Scanner(System.in);

     System.out.print("Enter Name: ");
     String s = scan.next();  

     System.out.print("Enter Roll No. : ");  
     int n=scan.nextInt();

     System.out.print("Enter age: ");
     int a=scan.nextInt();  

     Student s1=new Student();
     s1.name=s;
     s1.roll_no=n;
     s1.inputAge=a;

     System.out.println("Display the Student information:");
     s1.display();
     scan.close();
    }
}
