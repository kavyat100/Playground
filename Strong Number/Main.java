#include <stdio.h>
int main() {
	//Type your code
   int n,i,fact,sum=0,rem,k;
  scanf("%d",&n);
  k=n;
  while(n!=0)
  {
    rem=n%10;
    fact=1;
    for(i=rem;i>=1;i--)
    {
      fact=fact*i;
    }
    sum=sum+fact;
    n=n/10;
  }
  if(sum==k)
  printf("Yes");
  else
  printf("No");
	return 0;
}