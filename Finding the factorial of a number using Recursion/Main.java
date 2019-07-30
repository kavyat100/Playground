#include<stdio.h>
int main()
{
	//Try out your code here
  int fact=1,i,n;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
    fact=fact*i;
  printf("%d",fact);
	return 0;
}