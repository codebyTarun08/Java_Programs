//The Problem said that gives the possible maximum sum of subArray.
//1.Brute Force Method 2.Optimized O(n^2) 3.Kadane's Algo
public class MaximumSubArray {
    public static int maxSubArray1(int[] a) {
        int maxSum = Integer.MIN_VALUE;
        for (int start = 0; start < a.length; start++) {          //Iterating to 0 to n-1 element by start
            for (int end = start; end < a.length; end++) {        //Iterating to start to n-1 by end
                int currSum = 0;                                  //Taking currSum to 0
                for (int i = start; i <= end; i++) {             //Calculate Sum from start to end element
                    currSum += a[i];
                }    
                System.out.print(currSum + ",");         //This Line print the sum of all subArrays
                maxSum = Math.max(maxSum, currSum);     //This line update the maxSum by comparing to currSum
            }
            System.out.println("");                  //This line is using like endl
        }
        return maxSum;
    }
    //This code will gives the O(n^3) Time Complexity.
    public static int maxSubArray2(int[] a){
        int maxSum=Integer.MIN_VALUE;
        for(int start=0;start<a.length;start++){
            int currSum=0;
            for(int end=start;end<a.length;end++){
                currSum+=a[end];
                maxSum=Math.max(maxSum, currSum);
            }
        }
        return maxSum;
    }
    //This code will gives the O(n^2) Time Complexity.
    public static int maxSubArray3(int[] a){
        System.out.println("Kadane's Algorithm");
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<a.length;i++){
            currSum+=a[i];
            maxSum=Math.max(maxSum,currSum);
            if(currSum<0)
               currSum=0;
        }
        return maxSum;
    }
    //This code will gives the O(n) Time Complexity.
    public static void main(String[] args) {
           int[] arr = { 2, -3, 6, -5, 4, 2 };  //7
        // int[] arr = {5,4,-1,7,8};            //23
        // int[] arr = {-2,1,-3,4,-1,2,1,-5,4}; //6
        System.out.println("Max SubArray Sum: " + maxSubArray1(arr));
        System.out.println("Max SubArray Sum: " + maxSubArray2(arr));
        System.out.println("Max SubArray Sum: " + maxSubArray3(arr));
    }
}
