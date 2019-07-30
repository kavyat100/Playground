import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      int i,k;
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int[] arr=new int[n];
      for(i=0;i<n;i++)
      {
        arr[i]=in.nextInt();
      }
      k=arr[0];
      for(i=1;i<n;i++)
      {
        if(arr[i]>k)
        {
          k=arr[i];
        }
      }
      System.out.println(k);
    }
}