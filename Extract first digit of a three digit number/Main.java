import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      int a;
      Scanner n=new Scanner(System.in);
      a=n.nextInt();
      while(a>=10)
        a=a/10;
      System.out.println(a);
	}
}