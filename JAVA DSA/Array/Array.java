import java.util.*;

class Array{
    public static void printArray(int[] a){
        System.out.println("Array elements are:");
        for(int ele:a){
            System.out.print(ele+" ");
        }
        System.out.println(" ");
    }
    public static int largestElement(int[] a){
        int max=Integer.MIN_VALUE;
        System.out.println("Maximum element is:");
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
    }
    public static int lowestElement(int[] a){
        int min=Integer.MAX_VALUE;
        System.out.println("Minimum element is:");
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        return min;
    }
    public static void reverse1(int[] a){
        int i,j;
        for(i=0,j=a.length-1;i<j;i++,j--){
            int temp=a[j];
            a[j]=a[i];
            a[i]=temp;
        }
        for(int ele:a){
            System.out.print(ele+" ");
        }
        System.out.println(" ");
    }
    public static void reverse2(int[] a){
        int i,j;
        int[] b=new int[a.length];
        for(i=a.length-1,j=0;i>=0;i--,j++){
             b[j]=a[i];
        }
        for(int e:b){
            System.out.print(e+" ");
        }
        System.out.println(" ");
    }
    public static boolean linearSearch(int[] a,int key){
        for(int i=0;i<a.length;i++){
            if(a[i]==key)
               return true;
        }
        return false;
    }
    public static boolean binarySearch(int[] a,int key){
        int low,high;
        low=0;
        high=a.length-1;
        int mid=(low+high)/2;
        while(low<high){
            if(a[mid]==key){
                System.out.println("found at "+mid);
                return true;
            }
            else if(a[mid]<key){
                low=mid+1;
                mid=(low+high)/2;
            }
            else if(a[mid]>key){
                high=mid-1;
                mid=(low+high)/2;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array size");
        int size=sc.nextInt();
        int[] arr1=new int[size];
        System.out.println("Enter the Array element");
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        printArray(arr1);
        System.out.println(largestElement(arr1));
        System.out.println(lowestElement(arr1));
        System.out.println("Reverse 1");
        reverse1(arr1);
        System.out.println("Reverse 2");
        reverse2(arr1);
        int key=sc.nextInt();
        System.out.println(linearSearch(arr1,key));
        System.out.println(binarySearch(arr1,key));
        sc.close();
    }
}
