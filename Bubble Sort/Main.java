#include<stdio.h>
int main()
{
  //Type your code here
  int n,arr[10],temp,i,j;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  scanf("%d",&arr[i]);
  for(i=0;i<n;i++)
  {
    for(j=i+1;j<n;j++)
    {
      if(arr[j]<arr[i])
      {
         temp=arr[i];
         arr[i]=arr[j];
         arr[j]=temp;
      }
    }
  }
  for(i=0;i<n;i++)
  {
    printf("%d\n",arr[i]);
  }
  return 0;
}