#include <stdio.h>
int main() {
	//Type your code
  int n,k,i=0,rem;
  scanf("%d",&n);
  k=n;
  while(n!=0)
  {
     rem=n%10;
     n=n/10;
     i=i+1;
  }
 while(i<k)
 {
   rem=k%10;
   k=k/10;
   i=i+1;
 }
 printf("%d",rem);
	return 0;
}