import java.util.*;
class great
{
	public static void main(String args[])
	{
		Scanner kush=new Scanner(System.in);
		System.out.println("enter a: ");
		float a=kush.nextFloat();
		System.out.println("enter b: ");
		float b= kush.nextFloat();
		System.out.println("enter c: ");
		float c= kush.nextFloat();
		if(a>b&&a>c)
		System.out.println(" a is greatest ");
		else if(b>c)
		System.out.println(" b is greatest ");
		else
		System.out.println(" c is greatest ");
	}
}