class Sol{
    public int minimumDeletions(String s) {
        int del=0;
        for(int i=0,j=i+1;i<s.length()-2;i++,j++){
            if((i<j)){
              if((s.charAt(i)=='b')&&(s.charAt(j)=='a')){
                del++;
              }            
            }
        }
        System.out.println(s);
        return del;
    }
}
public class LeetCode1653 {
    public static void main(String[] args) throws Exception {
        Sol s=new Sol();
        System.out.println(s.minimumDeletions("aababbab"));
        System.out.println(s.minimumDeletions("bbaaaaabb"));
    }
}
