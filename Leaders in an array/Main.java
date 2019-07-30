#include <stdio.h>
int main() 
{
    //write your code here
  int n,arr[10],i,j,k=0;
  scanf("%d",&n);
  for(i=0;i<n;i++)
    scanf("%d",&arr[i]);
  for(i=0;i<n;i++)  
  {
    for(j=i+1;j<n;j++)  
    {
      k=0;
      if(arr[i]<arr[j]) 
      {
        k=1;
        break;
      }
    }
    if(k==0)
      printf("%d ",arr[i]);
  }
}