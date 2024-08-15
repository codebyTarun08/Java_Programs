import java.util.*;

public class StringPractice {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        
        System.out.println(s1.length()+s2.length());
        
        int res=s1.compareTo(s2);
        System.out.println(res);
        if(res==2){
            System.out.println("Yes");
        }
        else
         System.out.println("No");  
        char c1=s1.charAt(0);
        char c2=s2.charAt(0);   
        String s3=s1.replace(s1.charAt(0), Character.toUpperCase(c1));
        String s4=s2.replace(s2.charAt(0),Character.toUpperCase(c2));
        String s5=s3+' '+s4;
        System.out.println(s5);
    }
}
