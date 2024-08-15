import java.util.*;
class Pallindrome{
    public static boolean isPallindrome(String r){
        int low=0;
        int high=r.length()-1;
        while(low<high){
            if(r.charAt(low)!=r.charAt(high)){
              return false;
            }
            low++;
            high--;
        }
     return true;
    }
public static void main1(String[] args){
    Scanner sc=new Scanner(System.in);
    String s1=sc.next();
    if(isPallindrome(s1)){
        System.out.println(s1+" is pallindrome");
    }
    else
    System.out.println(s1+" is not pallindrome");
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s1="madam";
    // String s1=sc.next();
    String srev="";
    for(int i=s1.length()-1;i>=0;i--){
        srev=srev+s1.charAt(i);
        System.out.println(srev);
    }
    if(srev.equals(s1)){
        System.out.println("Yes");
    }
    else{
        System.out.println("No");
    }
 }
}