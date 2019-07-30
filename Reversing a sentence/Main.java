#include<stdio.h>
int main()
{
  // Type your code here
  char str[900],str2[100];
  int i,j,len,k;
  gets(str);
  len=strlen(str);
  k=len;
  for(i=len-1;i>0;i--)
  {
    if(str[i]==' ')
    {
      for(j=i+1;j<k;j++)
      {
        printf("%c",str[j]);
      }
      printf(" ");
      k=i;
    }
  }
  printf("%c",str[i]);
}