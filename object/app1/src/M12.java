class  M12
{
	public static void main(String[] args) 
	{
		class A extends Thread
		{
		}
		A a1=new A();
		Thread t1=new Thread();
		System.out.println(a1);
		System.out.println(t1);
	}
}
//thread class also to string overrided