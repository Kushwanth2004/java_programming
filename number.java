import java.util.*;
class number
{
	public static void main(String args[])
		{
			Scanner kush= new Scanner(System.in);
			System.out.println("enter the value: ");
			float x= kush.nextFloat();
			if(x>0)
			System.out.println("positive");
			else if(x<0)
			System.out.println("negative");
			else
			System.out.println(" value is 0");
		}
}