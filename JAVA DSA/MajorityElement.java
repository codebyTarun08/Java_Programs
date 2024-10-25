/*
Given an array arr. Find the majority element in the array. If no majority exists, return -1. A majority element in an array is an element that appears strictly more than arr.size() / 2 times in the array.

Examples : 

Input : arr[] = {1, 1, 2, 1, 3, 5, 1}
Output : 1
Explanation: Note that 1 appear 4 times which is more than  7 / 2 times 


Input : arr[] = {3, 3, 4, 2, 4, 4, 2, 4}
Output :  -1 
Explanation: There is no element whose frequency is greater than the half of the size of the array size.
*/

import java.util.HashMap;

public class MajorityElement {

    public static int bruteApproach(int[] arr){
     int n=arr.length;
     for(int i=0;i<n;i++){
        int count=1;
        for(int j=i+1;j<n;j++){
            if(arr[i]==arr[j]){
                count++;
            }
        }
        if(count>n/2){
            return arr[i];
        }
     }
     return -1;
    }
    //TC:O(n^2) SC:O(1)

    // public static int betterApproach(int[] arr){
    //     int n=arr.length;
    //     HashMap<Integer,Integer> m=new HashMap<>();
    //     for(int i=0;i<n;i++){
    //         int count=1;
    //         if(m.containsKey(arr[i])){
    //             m.put(arr[i],m.get(arr[i])+1);
    //         }
    //         m.put(arr[i],count);         
    //     }

    //     for(var x:m.entrySet()){
    //         if(x.getValue()>n/2){
    //             return x.getKey();
    //         }
    //     }
    //   return -1;
    // }

    public static int betterApproach(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> m = new HashMap<>();
            
        for (int i = 0; i < n; i++) {
            m.put(arr[i], m.getOrDefault(arr[i], 0) + 1);
        }
            
        for (var x : m.entrySet()) {
            if (x.getValue() > n / 2) {
                return x.getKey();
            }
        }           
        return -1;
    }
    //TC:O(n) SC:O(n)
    
    public static int optimalApproach(int[] arr){
        //Moor's voting algorithm
        int count=0;
        int ele=-1;
        int n=arr.length;
        //Find the candidate element
        for(int i=0;i<n;i++){
            if(count==0){
                count=1;
                ele=arr[i];
            }
            else if(arr[i]==ele){
                count++;
            }
            else{
                count--;
            }
        }

        //validate the Candidate element
        count=0;
        for(int num:arr){
            if(num==ele){
                count++;
            }
        }
        // return majority Element
        if(count>n/2){
            return ele;
        }
        return -1;
    }
    //TC:O(n) SC:O(1)
    public static void main(String[] args) {
     int[] A={1, 1, 2, 1, 3, 5, 1};
     System.out.println("BruteAPProach: "+bruteApproach(A));  
     System.out.println("BetterAPProach: "+betterApproach(A));  
     System.out.println("OptimalAPProach: "+optimalApproach(A)); 
    }
}
/*
 * O/p:
 * BruteAPProach: 1
   BetterAPProach: 1
   OptimalAPProach: 1
 */
