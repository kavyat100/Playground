// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  // Enter your code here 
  char str[100],st[100],c;
  int i,j,len;
  gets(str);
  len=strlen(str);
  for(i=0;i<26;i++)
  {
    st[i]=0;
  }
 for(i=0;i<len;i++)
  {
     if(str[i]>='a' && str[i]<='z')
     {
       j=str[i]-'a';
 	   st[j]++;
     }
    else if(str[i]>='A' && str[i]<='Z')
    {
      j=str[i]-'A';
      st[j]++;
    }
  }
  for(i=0;i<26;i++)
  {
    if(st[i]==0)
      printf("%c ",i+'a');
  }
}