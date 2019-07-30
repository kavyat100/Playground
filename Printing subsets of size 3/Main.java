#include<stdio.h>
int main()
{
  //Type your code here
  int n,i,j,k;
  scanf("%d",&n);
  int a[10];
  for(i=0;i<n;i++)
    scanf("%d",&a[i]);
  for(i=0;i<=n-2;i++)
  {
    for(j=i+1;j<=n-1;j++)
    {
      for(k=j+1;k<=n-1;k++)
      {
        printf("(%d, %d, %d) ",a[i],a[j],a[k]);
      }
    }
    printf("\n");
  }
  return 0;
}