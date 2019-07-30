#include <stdio.h>
int main() {
	// Type your code here
    int i,j,n,k=1;
    scanf("%d",&n);
    for(i=1;i<=n;i++)
    {
      for(j=1;j<=n-i;j++)
      {
        printf(" ");
      }
      for(j=1;j<=i;j++)
      {
        printf("%d ",k);
        k++;
      }
      printf("\n");
    }
	return 0;
}