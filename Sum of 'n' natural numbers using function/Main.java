#include<stdio.h>
int sum(int a);
int main() {
    // Type your code here
    int n,k;
    scanf("%d",&n);
    k=sum( n);
    printf("%d",k);
  	return 0;
}
int sum(int a)
{
   int sum;
   sum=(a*(a+1))/2;
   return sum;
}