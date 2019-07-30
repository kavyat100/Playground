#include<stdio.h>
int gr(int a,int b);
int main(){
	// Type your code here
  int k,l,m,res,res1;
  scanf("%d",&k);
  scanf("%d",&l);
  scanf("%d",&m);
  res=gr(k,l);
  res1=gr(m,res);
  printf("%d",res1);
  	return 0;
}
int gr(int a,int b)
{
  if(a>b)
  return a;
  else 
  return b;
}