import java.util.Scanner;
class PrimeNumber {

	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
		System.out.println("enter the number ");
int n=scn.nextInt();
int f=0;
if(n==0&&n==1){
System.out.println("no prime");
}//endd of the if condation 
else{
for(int i=2;i<n/2;i++){
if(n%i==0)
System.out.println("not a prime");
f++;
break;
}


if(f==0)
	System.out.println("yes"+n);
}//endd of the else





	}//endd of the main methodd 
}//end of the class
