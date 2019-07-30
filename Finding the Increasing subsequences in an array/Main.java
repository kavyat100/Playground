#include<stdio.h>
int main()
{
	//Try out your code here
  int n,a[100],i,j;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
    scanf("%d",&a[i]);
  for(i=1;i<=n;i++)
  {
    for(j=i+1;j<=n;j++)
    {
      if(a[j]>a[i])
      {
        printf("%d,%d\n",a[i],a[j]);
      }
    }
  }
	return 0;
}