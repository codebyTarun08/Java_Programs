import java.util.*;
public class GuessRandomNumber {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int user_num=0;
       int random_num=(int)(Math.random()*100);
       do{
        System.out.println("Enter User Number(0-100)");
        user_num=sc.nextInt();
        if(user_num<random_num){
            System.out.println("Tumhara number chota hai");
        }
        if(user_num==random_num){
            System.out.println("You fucking Guess The number");
            break;
        }
        if(user_num>random_num){
            System.out.println("your number is big");
        }
       }while(user_num>=0);
    }
}
