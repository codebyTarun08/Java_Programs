#include <iostream>
using namespace std;
void Print(int A[],int n,string s){
    cout<<s<<": ["<<flush;
    for(int i=0;i<n;i++){
        cout<<A[i]<<","<<flush;
    }
    cout<<"]"<<endl;
}
int findMax(int A[],int n){
    int max=INT32_MIN;
    for(int i=0;i<n;i++){
      if(A[i]>max){
        max=A[i];
      } 
    }
 return max;
}
void countSort(int A[],int n){
    int max,i,j;
    int *C;
    //Step 1: Find the maximum oF Given Array
    max=findMax(A,n);
    //Step 2: Create A Count Array of size=maximum element of Array.  
    C=new int[max+1];//C=(int *)malloc(sizeof(int)*(max+1));
    //Step 3:Initialize the Count Array with 0
    for(i=0;i<max+1;i++){
        C[i]=0;
    }
    //Step 4:Iterating through the Given A array and encounter the index=value of A and increment the value at index in count array;
    for(i=0;i<n;i++){
        C[A[i]]++;
    }
    //Step 5:Set i to count and j to A and iterating through the Count Array if the value is greater than 0 then insert the index in A from 0 onwards and decrement the value in count.
    i=0;
    j=0;
    while(i<max+1){
        if(C[i]>0){
            A[j++]=i;
            C[i]--;
        }
        else{
            i++;
        }
    }
}
int main(){
    int A[]={6,3,9,10,15,6,8,12,3,6};
    int n=sizeof(A)/sizeof(A[0]);
    Print(A,n,"A");
    countSort(A,n);
    Print(A,n,"A");
    return 0;
}