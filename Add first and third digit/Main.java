import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      int a,b,sum=0,k;
      Scanner n=new Scanner(System.in);
      a=n.nextInt();
      k=a;
      while(a>=10)
      {
        a=a/10;
      }
      b=k%10;
      sum=a+b;
      System.out.println(sum);
	}
}