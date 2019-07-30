#include<stdio.h>
#include<math.h>
int po(int a,int b);
int main(){
    // Type your code here
    int n1,n2,res;
    scanf("%d",&n1);
    scanf("%d",&n2);
    res=po(n1,n2);
    printf("%d",res);
}
int po(int a,int b)
{
   int power;
   power=pow(a,b);
   return power;
}