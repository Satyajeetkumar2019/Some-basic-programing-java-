import java.util.Scanner;
class ArmstrongNumbers { 

	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
		System.out.println("Enter the any numbre :");
		int num=scn.nextInt();
		int temp=num;
		int sum=0;
		int remender;
		//armstrong numbr 153, 
		while(num>0){
		remender=num%10;
      sum=sum+(remender*remender*remender);
		num=num/10;
		
		}//end of the whilee loop
		if(temp==sum)
			System.out.println("yes");
else
	System.out.println("no");

	}//end of the main method
}//end of the class
