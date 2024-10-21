#include <stdio.h>
#include <stdlib.h>

/*Here the user type datatype is defined by structure.
  The missElementList is array of missing elements*/
struct missElementList
{
  int *missElement;
  int count;
}mref;

//This function simple calucates and returns the minimum element.
int minimumElement(int a[], int length)
{
  int min = __INT32_MAX__;
  for (int i = 0; i < length; i++)
  {
    if (a[i] < min)
    {
      min = a[i];
    }
  }
  return min;
}
//This function simple calucates and returns the maximum element.
int maximumElement(int a[], int length)
{
  int max = a[0];
  for (int i = 0; i < length; i++)
  {
    if (a[i] > max)
    {
      max = a[i];
    }
  }
  return max;
}

//This method is simple and applicable only if there is one elements is miss in list.
int missingNumberMethod1(int a[], int length)
{
  int sum = 0;
  for (int i = 0; i < length; i++)
  {
    sum += a[i];
  }
  int n = a[length - 1];
  //This formula is for calculating the Sum of First n Natural numbers.
  int sumOfNatural = n * (n + 1) / 2;
  return sumOfNatural - sum;
}

/*This method is 2nd approach 2 find the missing number.
 Here we first calculate the minimum number and also diff btw index and minimum
 and iterate through the array and if the diff is not equal then stop return the missing element by returning
 i + diff (here i is that at which the diff is not equal index and diff is previous difference)*/
int missingNumberMethod2(int a[], int length)
{
  int l = minimumElement(a, length);
  int diff = l - 0;
  for (int i = 0; i < length; i++)
  {
    if (a[i] - i != diff)
    {
      return i + diff;
    }
  }
  return -1;
}

//This function is special because it giving the list of missing elements.
//here in this function i personally design a function in struct to return both size of missing list and as well as missing list.

/*In this Function if the diff is not equal to the (A[i]-i) then we add the missing number by (i+diff) and 
iteratate untill the new diff(A[i]-i) not equal*/
/* Here i Learned 2 new things:
   1- malloc function does not initialize the array in heap.
      Syatax: int *p=(int *)malloc(5*sizeof(int));
   2- calloc is used to intialize the array in heap to 0. 
      Syntax: int *p=(int *)calloc(5,sizeof(int));
   3.realloc function is  used to reallocate the memory in heap.
      Syntax: p=(int *)realloc(reference,newSize(k*sizeof(int)));
*/
struct missElementList missingListOfNumber(int a[], int length)
{
  int low = minimumElement(a, length);
  int high = maximumElement(a, length);
  int diff = low - 0;
  int k = 0;
  int *missElements = (int *)malloc((high - low) * sizeof(int));
  for (int i = 0; i < length; i++)
  {
    if (a[i] - i != diff)
    {
      while (diff < a[i] - i)
      {
        missElements[k++] = i + diff;
        diff++;
      }
    }
  }
  
  missElements = (int *)realloc(missElements, k * sizeof(int));
  struct missElementList result={missElements,k};
// Struct type value is returned.
  return result;
}

/*In this method we are using Hashtable of size equal to maximumElement in a[].
  We are initialize the *H to 0 by using calloc function*/
void missingListOfNumberMethod2(int a[], int length)
{
  int low = minimumElement(a, length);
  int high = maximumElement(a, length);
  int *H = (int *)calloc(high+1 , sizeof(int));
  int *missElement = (int *)malloc((high - low) * sizeof(int));
  // int *H = (int *)malloc(high * sizeof(int));
  // if (H != NULL) {
  //   memset(H, 0, high * sizeof(int));
  // }
  for (int i = 0; i < length; i++)
  {
    H[a[i]]++;
  }
  int k = 0;
  for (int l = low; l <= high; l++)
  {
    if (H[l] == 0)
    {
      missElement[k++] = l;
    }
  }
  missElement = (int *)realloc(missElement, k * sizeof(int));
  for (int i = 0; i < k; i++)
  {
    printf("%d ", missElement[i]);
  }
  free(H);
  free(missElement);
}

int main()
{
 /* First Type:Misssing elements in Sorted Array:-
  int arr[]={1,2,3,4,5,6,8,9,10,11,12};
  printf("%d is missing number.",missingNumberMethod1(arr,length));
  printf("%d is missing number.",missingNumberMethod2(arr,length));
 */
  
  int arr[] = {6, 7, 8, 9, 11, 12, 15, 16, 17, 18, 19};
  int length = (sizeof(arr) / sizeof(arr[0]));
  printf("%d is length\n", length);
/* List of missing number*/
 struct missElementList p = missingListOfNumber(arr, length);
  for (int i = 0; i < p.count; i++) {
    printf("%d ", p.missElement[i]);
  }
  printf("\n");

  free(p.missElement);

  /*Using Hastable approach
    missingListOfNumberMethod2(arr,length);
  */
  
  return 0;
}
/*
o/p:
11 is length
10 13 14 
*/

