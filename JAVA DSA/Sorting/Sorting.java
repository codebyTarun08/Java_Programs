public class Sorting{
    public static void swap(int[] A,int i,int j){
        int temp=A[i];
        A[i]=A[j];
        A[j]=temp;
    }
    public static void print(int[] A){
        int i;
        for(i=0;i<A.length;i++){
            System.out.print(A[i]+" ,");
        }
    }
//This algo compares two consecutive elements if first elment larger than second then swap it. 
    public static void bubbleSort(int[] A,int n){
        int i,j;
        int flag;
        for(i=0;i<n-1;i++){ //This for loop is iterating to the passes.
            flag=0;
            for(j=0;j<n-1-i;j++){  //here i is use to reduce the comparison everytime in passes.
                if(A[j]>A[j+1]){
                    swap(A,j,j+1);
                    flag=1;
                }
            }
            if(flag==0){      //Flag variable is use to make algo Adaptive.Flag is use to check if the Swap is done or not.
                break;
            }
        }
    }
    //The bubble sort takes O(n^2) time comjplexity to complete the algorithm.


/*In Insertion sort algo we assume the first index of array is sorted and the other element is unsorted.
So in each pass we take a element from unsorted array and insert it in sorted element.
If element is shorter than sorted element then we shift the sorted element.
Aur shifting tab tak hogi jab tak j -ve na ho jaaye iska matlab sorted array poora traverse ho chuka hai.
*/
    public static void insertionSort(int[] A,int n){ 
        int i;
        for(i=1;i<n;i++){  //This for is use for passes.Here i=1 because first element is already sorted on the basis of assumption.
            int j=i-1; //j=0
            int x=A[i];//Taking element from the unsorted array.
            while(j>-1 && A[j]>x){ //repeating iteration if x is shorted than the sorted element to the j>-1
                A[j+1]=A[j];    //Shifting to right 
                j--;            
            }
            A[j+1]=x;   //Assigning x to its Sorted place
        }
    }
//This algo take O(n^2) time complexity.

    public static void selectionSort(int[] A,int n){
    int i,j,k;
    for(i=0;i<n-1;i++){
        for(j=k=i;j<n;j++){
            if(A[j]<A[k]){
                k=j;
            }
        }
        swap(A,i,k);
      }
    }

    public static int partition(int[]A ,int l,int h){
        int pivot=A[l];
        int i=l;
        int j=h;
        do{
            do{i++;}while(A[i]<=pivot);
            do{j--;}while(A[j]>pivot);
            if(i<j){
                swap(A, i, j);
            }
        }while(i<j);
        swap(A, l, j);
        return j;
    }
    public static void quickSort(int[] A,int l,int h){
        int j;
        if(l<h){
            j=partition(A,l,h);
            quickSort(A,l,j);
            quickSort(A,j+1,h);
        }
    }
    public static void merge(int[] A,int l,int mid,int h){
        int i=l,j=mid+1,k=l;
        int[] B=new int[100];
        while(i<=mid && j<=h){
            if(A[i]<A[j])
                B[k++]=A[i++];
            else 
                B[k++]=A[j++];
        }
        for(;i<=mid;i++)
           B[k++]=A[i];
        for(;j<=h;j++)
           B[k++]=A[j];
        for(i=l;i<=h;i++){
            A[i]=B[i];
        }
    }
    public static void ImergeSort(int[] A,int n){
        int p,l,mid,h,i;
        for(p=2;p<=n;p=p*2){
            for(i=0;i+p-1<n;i=i+p){
                l=i;
                h=i+p-1;
                mid=(l+h)/2;
                merge(A, l, mid, h);
            }
        }
        if(p/2<n){
            merge(A, 0, p/2-1, n-1);
        }
    }
    public static void RmergeSort(int[] A,int l,int h){
        if(l<h){
            int mid=(l+h)/2;
            RmergeSort(A, l, mid);
            RmergeSort(A, mid+1, h);
            merge(A, l, mid, h);
        }
    }
    public static void main(String[] args) {
        // int[] arr={8,5,7,3,2};
        int[] arr={11,13,7,12,16,9,24,5,10,3};
        // int[] arr={8,6,3,2,5,4,Integer.MAX_VALUE};
        int n=arr.length;
        // bubbleSort(arr, n);
        // insertionSort(arr, n);
        // selectionSort(arr, n);
        // quickSort(arr, 0, n-1);
        // ImergeSort(arr, n);
        // RmergeSort(arr, 0, n-1);
        print(arr);
    }
}
