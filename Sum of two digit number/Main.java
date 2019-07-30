import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      int a,k,rem,sum;
      Scanner n=new Scanner(System.in);
      a=n.nextInt();
      rem=a%10;
      k=a/10;
      sum=k+rem;
      System.out.println(sum);
	}
}