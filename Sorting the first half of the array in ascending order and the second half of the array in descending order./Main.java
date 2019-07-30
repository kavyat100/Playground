#include<stdio.h>
int main()
{
	//Try out your code here
  int n,a[100],i,j,temp;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
    scanf("%d",&a[i]);
  for(i=1;i<=n/2;i++)
  {
    for(j=1;j<=n/2-1;j++)
    {
      if(a[j]>a[j+1])
      {
        temp=a[j];
        a[j]=a[j+1];
        a[j+1]=temp;
      }
    }
  }
  for(i=n/2;i<=n;i++)
  {
    for(j=n/2+1;j<=n;j++)
    {
      if(a[j]<a[j+1])
      {
        temp=a[j];
        a[j]=a[j+1];
        a[j+1]=temp;
      }
    }
  }
  for(i=1;i<=n;i++)
    printf("%d ",a[i]);
	return 0;
}