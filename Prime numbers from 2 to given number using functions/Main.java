#include<stdio.h>
int prime(int a);
int main(){
    // Type your code here
    int n,i;
    scanf("%d",&n);
    prime(n);
}
int prime(int a)
{
    int i,j,k;
    for(i=2;i<=a;i++)
    {
        k=0;
       for(j=2;j<=i/2;j++)
       {
         if(i%j==0)
         k++;
       }
      if(k==0)
      printf("%d\n",i);
    }
}