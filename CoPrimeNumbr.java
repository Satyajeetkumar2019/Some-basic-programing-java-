import java.util.Scanner;
class CoPrimeNumbr {

	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
		System.out.println("Enterthe two  number ");
int a=scn.nextInt();
int b=scn.nextInt();
int f=0;
int min=a<b?a:b;
for(int i=2;i<=min;i++){
if(a%i==0&&b%i==0)
	f++;
break;
}

if(f==0)
	System.out.println("Yes");
	else
System.out.println("No");


	}//end of the main methodd
}//end of the class
