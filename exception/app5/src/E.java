import java.util.Scanner;
class E
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter ur age ");
		int age =sc .nextInt();
		if (age <=0)
		{
		throw new ArithmeticException("age should be >=0");
		}
		System.out.println("continue.............");
	}.
}
//throw keyword is used for rising specified exception Expilicitly
//ask the rte to stop the flow explicitly