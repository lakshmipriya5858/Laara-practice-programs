abstract class A 
{
	abstract void test();
}
class U extends A
{
	void test(int i)
	{
		System.out.println("test(int)!");
	
	}
    public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
/*
CTE*/
//************overriding principles holds good while implementing abstract method in the sub class 
//inherited method not overriding 