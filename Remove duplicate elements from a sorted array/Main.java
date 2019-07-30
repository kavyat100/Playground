#include <stdio.h>
int main() 
{
    //write your logic here
    int n,arr[10],i,k,j;
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
      scanf("%d",&arr[i]);
    }
    for(i=0;i<n;i++)
    {
      k=1;
      for(j=i+1;j<n;j++)
      {
         if(arr[i]==arr[j])
         {
           k=0;
         }
      }
      if(k==1)
      printf("%d ",arr[i]);
    }
}