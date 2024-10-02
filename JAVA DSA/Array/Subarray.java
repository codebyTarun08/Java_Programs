public class Subarray {
    public static void printSubArray(int[] a){
       for(int start=0;start<a.length;start++){ // it is execute by n time
        for(int end=start;end<a.length;end++){  // it is execute by n time
            //It is for printing indexing of subArrays from start to end
            // System.out.print("("+start+","+end+")");

            //It is used for printing the elements of array from start to end.
            for(int i=start;i<=end;i++){  // it is execute by n time
                System.out.print(a[i]);
            }
            System.out.print(",");
        }
        System.out.println("");
       }
    }
   public static void main(String[] args) {
    int[] arr={1,2,3,4,5};
    printSubArray(arr);
   } 
}

//So the time complexity is O(n^3)