#include <stdio.h>
#include<math.h>
int main() {
	//Type your code
  int n,sum=3,rem=0,res=0,res1=0,k;
  scanf("%d",&n);
  k=n;
  while(n!=0)
  {
    rem=n%10;
    res=pow(rem,sum);
    res1=res1+res;
    n=n/10;
  }
  if(k==res1)
    printf("Armstrong Number");
  else 
    printf("Not an Armstrong Number");
	return 0;
}