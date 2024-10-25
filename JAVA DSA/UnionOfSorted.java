/*
Union of Two Sorted Arrays with Duplicate Elements
Difficulty: MediumAccuracy: 31.39%Submissions: 338K+Points: 4
Given two sorted arrays a[] and b[], where each array may contain duplicate elements , the task is to return the elements in the union of the two arrays in sorted order.

Union of two arrays can be defined as the set containing distinct common elements that are present in either of the arrays.
Examples:

Input: a[] = [1, 2, 3, 4, 5], b[] = [1, 2, 3, 6, 7]
Output: 1 2 3 4 5 6 7
Explanation: Distinct elements including both the arrays are: 1 2 3 4 5 6 7.
 */
import java.util.ArrayList;

public class UnionOfSorted {

     public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
        ArrayList<Integer> union=new ArrayList<>();
        int n1=a.length;
        int n2=b.length; 
        int i=0;
        int j=0;
        int k=-1;
        while(i<n1 && j<n2){
            if(a[i]<=b[j]){
                if(union.size()==0 || union.get(k)!=a[i]){
                    union.add(a[i]);
                    k++;
                }
                i++;
            }
            else{
                if(union.size()==0 || union.get(k)!=b[j]){
                    union.add(b[j]);
                    k++;
                }
                j++;
            }
        }
        while(j<n2){
            if(union.size()==0 || union.get(k)!=b[j]){
                    union.add(b[j]);
                    k++;
            }
            j++;
        }
        while(i<n1){
            if(union.size()==0 || union.get(k)!=a[i]){
                    union.add(a[i]);
                    k++;
            }
            i++;
        }
        return union;
    }
    public static void main(String[] args) {
        int[] a={1, 2, 3, 4, 5};
        int[] b={1, 2, 3, 6, 7};
        ArrayList<Integer> u=findUnion(a, b);
        for(int x:u){
            System.out.print(x+'');
        }
    }
}
