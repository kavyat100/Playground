#include<stdio.h>
int square(int a);
int main() {
   // Type your code here
  int n,res;
  scanf("%d",&n);
  res=square(n);
  printf("%d",res);
   return 0;
}
int square(int a)
{
  int sum;
  sum=a*a;
  return sum;
}
