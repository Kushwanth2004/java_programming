import java.util.*;
class sum
{
	public static void main(String args[])
	{
		Scanner kush=new Scanner(System.in);
		System.out.println("enter value : ");
		int a=kush.nextInt();
		int b=kush.nextInt();
		int c=kush.nextInt();
		int d=kush.nextInt();
		int e=kush.nextInt();
		float sum,avg;
		sum=(a+b+c+d+e);
		avg=(a+b+c+d+e)/5;
		System.out.println("sum is " +sum+ "avg is "+avg);
	}
}
		