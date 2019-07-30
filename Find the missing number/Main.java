#include<stdio.h>
int main()
{
  //Type your code here
  int n,a[100],i,c,b;
  scanf("%d",&n);
  for(i=0;i<n;i++)
    scanf("%d",&a[i]);
  b=a[0];
  for(i=1;i<n-1;i++)
  {
    b=b^a[i];
  }
  for(i=2,c=1;i<=n;i++)
    c=c^i;
  c=c^b;
  printf("%d",c);
  return 0;
}