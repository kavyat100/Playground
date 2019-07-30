#include <stdio.h>
int gcd(int a,int b);
int main() {
	//Type your code here
    int m,n,l,res,res1;
  scanf("%d %d %d",&m,&n,&l);
    res=gcd(m,n);
    res1=gcd(l,res);
    printf("%d",res1);
	return 0;
}
int gcd(int a,int b){
  int i,gcd;
  for(i=1;i<=a && i<=b;++i)
  {
    if(a%i==0 && b%i==0)
      gcd=i;
  }
  return gcd;
}
    