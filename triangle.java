import java.util.*;
class triangle
{
	public static void main(String args[])
	{
		Scanner kush=new Scanner (System.in);
 		int i,j,n;
		System.out.print("Input number of rows : ");
		n = kush.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println(" ");
		}
	}
}