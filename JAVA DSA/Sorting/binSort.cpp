#include<iostream>
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
class Node{
public:
    int value;
    Node* next;
};
// void Insert(Node** binArray,int idx,int idx){
//     Node* temp=new node;
//     Node->value=idx;
//     Node->next=nullptr;
//     if(binArray[idx]==nullptr){
//         binArray[ids]=temp;
//     }
//     else{
//         Node* p=binArray[idx];
//         while(p->next!=nullptr){
//             p=p->next;
//         }
//         p->next=temp;
//     }
// }
void Insert(Node** ptrBins,int value,int idx){
    Node* temp=new Node;
    temp->value=value;
    temp->next=nullptr;
    if(ptrBins[idx]==nullptr){
        ptrBins[idx]=temp;//ptrBins[idx] is head ptr
    }
    else{
        Node* p=ptrBins[idx];
        while(p->next!=nullptr){
            p=p->next;
        }
        p->next=temp;
    }
}
int Delete(Node** ptrBins,int idx){
    Node* p=ptrBins[idx];
    ptrBins[idx]=ptrBins[idx]->next;
    int x=p->value;
    delete p;
    return x;
}
void binSort(int A[],int n){
    int max,i,j;
    Node** bins;
    max=findMax(A,n);
    bins=new Node* [max+1];
    for(i=0;i<max+1;i++){
        bins[i]=nullptr;
    }
    for(i=0;i<n;i++){
        Insert(bins,A[i],A[i]);
    }

    i=0;
    j=0;
    while(i<max+1){
        while(bins[i]!=nullptr){
            A[j++]=Delete(bins,i);
        }
        i++;
    }
}

int main(){
    int A[]={6,3,9,10,15,6,8,12,3,6};
    int n=sizeof(A)/sizeof(A[0]);
    Print(A,n,"A");
    binSort(A,n);
    Print(A,n,"A");
}