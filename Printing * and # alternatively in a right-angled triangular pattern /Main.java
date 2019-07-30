#include <stdio.h>
int main(){
	// Type your code here
    int i,j,n,t=0;
    scanf("%d",&n);
    for(i=1;i<=n;i++)
    {
      for(j=1;j<=i;j++)
      {
        if(t==0)
        { 
          printf("*");
          t=1;
        }
        else
        {
          printf("#");
          t=0;
        }
      } 
      printf("\n");
    }
  	return 0;
}