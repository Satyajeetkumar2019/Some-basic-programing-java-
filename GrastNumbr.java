import java.util.Scanner;
class GrastNumbr {

	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
		//System.out.println("Enterthe 10 number :");
int arr[]={12,2,5,6,5,90,7,8,55,10};
int j;
int max=arr[0];

for(j=1;j<=9;j++){
if(arr[j]>max)
max=arr[j];
}

System.out.println(max);
	}//tend of main mthod
}//end of the class
