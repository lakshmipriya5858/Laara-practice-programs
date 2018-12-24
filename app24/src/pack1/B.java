package pack1;
class A
{
	private int i;
	private void test1()
	{
	System.out.println("A-test1()");
	}
}
class B
{
public static void main(String[] args) 
	{
		A a1=new A();
		System.out.println(a1.i);
		a1.test1();
	}
	}
/*
CTE

private members can access within current class,but i:private:test1() 
*/