import java.util.Scanner;
class PrimeFactor {

	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
		System.out.println("Enter the any number :");
int x=scn.nextInt();
int i;
for(i=2;i>1;i++){
while(x%i==0){
System.out.print(i);
x=x/i;
}
}//end of the for loop

	}//end pf the main mthodd
}//endd of the class
