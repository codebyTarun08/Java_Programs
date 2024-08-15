class Solution{
    public int removeElement(int[] nums,int val){
        int count=0,temp;
        for(int i=0;i<nums.length;i++){
            if(i<nums.length && nums[i]==val){
                count++;
                temp=nums[i];
            }
        }
        for(int j=0;j<count;j++){
            nums[j]=nums[j+1];
        }
        for(int k=0;k<nums.length;k++){
           System.out.print(nums[k]+",");
        }
       return nums.length-count; 
    }
}
class Solution{
    public int removeElement(int[] nums,int val){
        int count=0,temp;
        for(int i=0;i<nums.length;i++){
            if(i<nums.length && nums[i]==val){
                count++;
                temp=nums[i];
                for(int j=0;j<count;j++){
                       nums[j]=nums[j+1];
                    } 
                nums.length--;
            }
            
        }
        
       return count; 
    }
}
class LeetCode27{
    public static void main(String[] args) {
        Solution l=new Solution();
        int[] list={3,2,2,3};
        int c=l.removeElement(list, 3); 
        System.out.println("count: "+ c);
        int[] list2={0,1,2,2,3,0,4};
        int c1=l.removeElement(list2, 2);
        System.out.println("count1: "+ c1);
    }
}