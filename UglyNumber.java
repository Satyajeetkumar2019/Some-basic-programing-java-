import java.util.Scanner;
class UglyNumber {

	public static void main(String[] args) {
	
Scanner scn=new Scanner(System.in);
//sum of the digit
int sum=0;
int num=scn.nextInt();
int count=0;
while(num !=0){
num=num/10;
count++;
sum=sum+count;
}
System.out.println("count \n "+count+"\n sum"+sum);





/*
//calcculate 	count digit 
int num=scn.nextInt();
int count=0;
//int i=0;
while(num !=0){
num=num/10;
count++;

}
System.out.println(count);
*/
//calculate powor numbre 
/*
System.out.println("entr the x value");
int x=scn.nextInt();
System.out.println("enter the y value");
int y=scn.nextInt();
int p=1;
for(int i=1;i<=y;i++){
p=x*p;
}
System.out.println("result :"+p);
*/

/*
//ugly number is prime factor number only 3,5,1;
for(int i=0;i<=num;i++){
if()


}*/



	}//end of the main method
}//end of the class
