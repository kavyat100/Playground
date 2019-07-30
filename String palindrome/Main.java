#include<stdio.h>
int main()
{
  //Type your code here
  char str1[100];
  int i,len,k,l=1;
  gets(str1);
  len=strlen(str1);
  k=len-1;
  for(i=0;i<len;i++)
  {
    if(str1[k]==str1[i])
    {
    	k--;
    }
    else
     l++;
  }
  if(l==1)
    printf("%s is a palindrome",str1);
  else
    printf("%s is not a palindrome",str1);
  
}