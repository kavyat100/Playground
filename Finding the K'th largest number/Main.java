#include<stdio.h>
int main()
{
//Type your code here
  int n,a[100],k,i,j,temp;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  scanf("%d",&a[i]);
  scanf("%d",&k);
  for(i=0;i<n;i++)
  {
     for(j=i+1;j<n;j++)
     {
        if(a[i]>a[j])
        {
          temp=a[i];
          a[i]=a[j];
          a[j]=temp;
        }
     }
  }
    printf("%d",a[2]);
return 0;
}