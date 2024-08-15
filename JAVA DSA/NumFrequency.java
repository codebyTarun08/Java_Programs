import java.util.*;
class NumFrequency{
    public static void main(String[] args) {
        int[] arr={3,2,2,1,1,1,3};
        int[] count=new int[arr.length];
        int[] nums;
        for(int k=0;k<)
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            count[i]=1;
            for(int j=i+1;j<arr.length;j++){
                 if(num==arr[j]){
                    count[i]++;
                }
            }
        }
        for(int x:count)
         System.out.println(x);
    }
}