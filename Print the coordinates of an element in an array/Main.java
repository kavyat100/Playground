#include<stdio.h>
int main()
{
  //Type your code here
  int i,j,arr[10][10],k,m,n,x,l=1;
  scanf("%d",&m);
  scanf("%d",&n);
  for(i=0;i<m;i++)
  {
    for(j=0;j<n;j++)
    {
      scanf("%d\n",&arr[i][j]);
    }
  }
  scanf("%d",&k);
  for(i=0;i<m;i++)
  {
    x=0;
    for(j=0;j<n;j++)
    {
      if(k==arr[i][j])
      {
       x=1;
       l=1;
       break;
      }
    }
    if(x==1)
    {
     printf("(%d, %d)",i,j);
     break;
    }
  }
  if(x!=1)
    printf("(-1, -1)");
}