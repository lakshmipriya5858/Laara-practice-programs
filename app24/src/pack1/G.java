package pack1;
class A
{
	private void test1()
	{
	
	}
}
class G extends A
{
	public static void main(String[] args) 
	{
		G g1=new G();
		g1.test1();
		System.out.println("done");
	}
}

/*CTE
E:\oct-23\app24\src>javac -d ..\classes pack1/F.java
pack1\F.java:11: error: i has private access in A
                System.out.println(f1.i);
                                     ^
1 error
*private members usage is with in the current class
*private methods are not involving in the inheritance */