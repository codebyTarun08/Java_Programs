class Solution{
    public int way(int n){
    int ways=0;
    while(ways<n){
      if(n%2==0 || n%1==0){
        ways++;
      }
    }
    return ways;
  }
}
public class LeetCode70 {
   public static void main(String[] args) {
    Solution l=new Solution();
    System.out.println(l.way(2));
    System.out.println(l.way(3));
    System.out.println(l.way(4));
   } 
}
