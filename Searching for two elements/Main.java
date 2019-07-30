import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      int i,k=0,m=0;
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int[] arr=new int[n];
      for(i=0;i<n;i++)
      {
        arr[i]=in.nextInt();
      }
      int a=in.nextInt();
      int b=in.nextInt();
      for(i=0;i<n;i++)
      {
        if(arr[i]==a)
        {
         System.out.println(i);
          k=1;
        }
         if(arr[i]==b)
         {
           System.out.println(i);
           m=1;
           break;
         }
      }
      if(k==0 || m==0)
     	System.out.println(-1);
    }
  
}