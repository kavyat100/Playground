#include <stdio.h>
int main() {
	// Type your code here
    int i,j,n,k;
    scanf("%d",&n);
    for(i=1;i<=n;i++)
    {
      for(j=1;j<=n;j++)
      {
        if(i%2==0)
        { 
          if(j!=1)
          printf("%d",i);
          else
          printf("%d",i+1);
        }
        else
        {
          if(j!=n)
          printf("%d",i);
          else
          printf("%d",i+1);
        }
      }
      printf("\n");
    }
	return 0;
}