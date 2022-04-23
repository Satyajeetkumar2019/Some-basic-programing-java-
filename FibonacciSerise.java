import java.util.Scanner;
class FibonacciSerise{

	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
		System.out.println("Enter the any number ");
		int n=scn.nextInt();
		int a=-1;
		int b=1;
		int c;
		for(int i=1;i<=n;i++){
          c=a+b;
		  System.out.println(c);
		a=b;
		b=c;
		
		
		}//end of the for loop




	}//end of the main mthod
}//end of the class
