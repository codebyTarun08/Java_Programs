#include <stdio.h>
#include <stdlib.h>
void printArray(int p[],int n){
    for(int start=0;start<n;start++){
        printf("%d ",p[start]);
    }
}
int* duplicateList(int a[],int length,int *k){
    int *duplicates=(int *)malloc(length*sizeof(int));
    int lastDuplicate=-1;
    *k=0;
    for(int i=0;i<length-1;i++){
        if(a[i]==a[i+1] && a[i]!=lastDuplicate){
           duplicates[(*k)++]=a[i];
           lastDuplicate=a[i];
        }
    }
    duplicates=(int *)realloc(duplicates,(*k)*sizeof(int));
    return duplicates;
}
void countDuplicate(int a[],int length){
    int j;
    for(int i=0;i<length-1;i++){
        if(a[i]==a[i+1]){
          j=i+1;
          while(a[i]==a[j]){j++;}
          printf("%d is appearing %d times\n",a[i],j-i);
          i=j-1;
        }
    }
}
int main(){
    int arr[]={3,6,8,8,10,12,15,15,15,20};
    int length=sizeof(arr)/sizeof(arr[0]);
    int k;
    int *p=duplicateList(arr,length,&k);
    printArray(p,k);
    free(p);
    
    printf("\n");
    countDuplicate(arr,length);
    return 0;
}