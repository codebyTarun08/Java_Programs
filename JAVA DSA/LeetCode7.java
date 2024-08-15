import java.lang.Math;
// class Solution{
//     public int reverse(int x){
//         int rev=0;
//         int copy=x;
//         if(x<0){
//             int pos=Math.abs(x);
//             while(pos>0){
//                 rev=rev*10 + pos%10;
//                 pos=pos/10;
//                 if(rev<0 && rev>-2147483648){
//                     return 0;
//                 }               
//             }
//             return -rev;
//         }
//         else{
//             while(copy>0){
//                 rev=rev*10 + copy%10;
//                 copy=copy/10;
//             }
//             if(rev>2147483647 || rev<-2147483648){
//                 return 0;
//             }
//         }   
//         return rev;
//     }
// }
class Solution{
    public int reverse(int x){
        long rev=0;
        for(;x!=0;x=x/10){
            rev=rev*10+x%10;
        }
        if(rev>2147483647 || rev<-2147483648){
            return 0;
        }
        else{
            return (int)rev;
        }
    }
}
public class LeetCode7 {
    public static void main(String[] args) throws Exception {
        Solution s = new Solution();
        System.out.println("return: "+s.reverse(-123));
        System.out.println("return: "+s.reverse(123));
        System.out.println("return: "+s.reverse(120));
        System.out.println("return: "+s.reverse(1534236469));
    }
}


