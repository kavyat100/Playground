#include<stdio.h>
int main()
{
  //Type your code here
  int n,arr[10],i,j,min_index=1,temp;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  scanf("%d",&arr[i]);
  for(i=0;i<n;i++)
  {
     min_index=i;
     for(j=i+1;j<n;j++)
     {
       if(arr[j]<arr[min_index])
       {
         min_index=j;
       }
     }
    temp=arr[i];
    arr[i]=arr[min_index];
    arr[min_index]=temp;
  }
  for(i=0;i<n;i++)
    printf("%d\n",arr[i]);
  return 0;
}