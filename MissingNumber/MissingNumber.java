public class MissingNumber {
    //This method is applicable when array contains contiguous natural number starting from 1
    public int missInNatural(int[] a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        int n=a[a.length-1];
        int s=(n*(n+1))/2;  //This is the formula of n natural numbers.
        System.out.println(s +" "+ sum);
      return s-sum;
    }

    //This methods is applicable when array is sorted and missing only one number.
    public int missNumber(int[] b){
        int diff=b[0]-0;  //Initial difference btw index and element present at initial index of array
        for(int i=0;i<b.length;i++){
            if((b[i]-i)!=diff){
                return i+diff;
            }
        }
        return -1;
    }
//This method is applicable when array is sorted and more than one numbers are missing.
    public void multipleMiss(int[] c){
        int diff=c[0]-0;
        for(int i=0;i<c.length;i++){
            if((c[i]-i)!=diff){
                while(diff<(c[i]-i)){
                    System.out.println("Missing number: "+ (i+diff));
                    diff++;
                }
            }
        }
    }

    //This method is applicable for sorted as well as unsorted array.
    //This method is working in O(n) time.
    public void multipleMissUnsort(int[] d){
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i=0;i<d.length;i++){
           if(d[i]<min){
            min=d[i];
           }
           if(d[i]>max){
            max=d[i];
           }
        }
        int low=min;
        int high=max;
        int[] h=new int[max+1];
        for(int i=0;i<d.length;i++){
            h[d[i]]++;
        }
        for(int k=low;k<high;k++){
            if(h[k]==0){
                System.out.println("Missing number: "+ k);
            }
        }
    }
    public static void main(String[] args) {
        MissingNumber m=new MissingNumber();
        // int[] arr={1,2,3,4,5,6,8,9,10,11,12};
        // System.out.println("Missing number: "+ m.missInNatural(arr));

        // int[] arr1={6,7,8,9,10,11,13,14,15,16,17};
        // System.out.println("Missing number: "+ m.missNumber(arr1));

        // int[] arr2={6,7,8,10,11,13,14,15,17,21};
        // System.out.println("Missing number: ");
        // m.multipleMiss(arr2);

        
        int[] arr3={3,7,2,6,8,10,4};
        m.multipleMissUnsort(arr3);  
    }
}
