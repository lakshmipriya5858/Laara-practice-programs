package pack1;
class A
{
	private int i;
}
class F extends A
{
	public static void main(String[] args) 
	{
		F f1=new F();
		System.out.println(f1.i);
	}
}

/*CTE
E:\oct-23\app24\src>javac -d ..\classes pack1/F.java
pack1\F.java:11: error: i has private access in A
                System.out.println(f1.i);
                                     ^
1 error
*private members usage is with in the current class
*private members are not involving in the inheritance */