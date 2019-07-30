#include <stdio.h>
int main() 
{
	//write your code here
     int m,n,x,arr1[10],arr2[10],arr[40],j=0,k=0,i=0;
     scanf("%d\n",&m);
     scanf("%d\n",&n);
     for(x=0;x<m;x++)
       scanf("%d\n",&arr1[x]);
     for(x=0;x<n;x++)
       scanf("%d\n",&arr2[x]);
     while(i<m && j<n)
     {
       if(arr1[i]<arr2[j])
        arr[k++]=arr1[i++];
        else
        arr[k++]=arr2[j++];
     }
      while (i < m)
         arr[k++] = arr1[i++];
      while (j < n)
         arr[k++] = arr2[j++];
     for(x=0;x<m+n;x++)
      printf("%d ",arr[x]);

}