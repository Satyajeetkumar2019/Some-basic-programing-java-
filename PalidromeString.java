import java.util.Scanner;
class PalidromeString {

	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the string ");
	String  str=scn.nextLine();
	int leng=str.length();
	int l=leng;
	int i=0;
	for( i=0;i<(l/2);i++){
	if(str[i]!=str[leng-1])
	System.out.println("not string :");
	
	}//end of the for loop
	if(i==(leng/2))
		System.out.println("string is palidrome ");


		//System.out.println("Hello World!");
	}//end of the main method 
}//end of the class
