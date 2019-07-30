#include<stdio.h>
int main()
{
 //Type your code here
  int n,a[10],k,i;
  scanf("%d",&n);
  for(i=0;i<n;i++)
    scanf("%d",&a[i]);
  scanf("%d",&k);
   i=n-1;
   while(k<a[i] && i>=0)
   {
     a[i+1]=a[i];
     i--;
   }
   a[i+1]=k;
   n++;
  for(i=0;i<n;i++)
    printf("%d ",a[i]);

}