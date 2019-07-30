#include<stdio.h>
int main()
{
  //Type your code here
  int n,arr[100],s1,s2,i,k=0;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d ",&arr[i]);
  }
  scanf("%d",&s1);
  for(i=0;i<n;i++)
  {
    if(arr[i]==s1)
    {
      k=1;
      printf("%d\n",i);
      break;
    }
  }
  scanf("%d",&s2);
  k=0;
  for(i=0;i<n;i++)
  {
    if(s2==arr[i])
    {
      k=1;
      printf("%d\n",i);
      break;
    }
  }
  if(k==0)
  printf("-1");
  return 0;
}