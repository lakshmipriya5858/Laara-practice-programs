interface A
{
  void test1();
  void test2();
} 
class P implements A
{
    public void test1()
	{
		System.out.println("p-test1()");
	}
 public void test2()
	{
		System.out.println("p-test2()");
	}

	public static void main(String[] args) 
	{
		P p1=new P();
		p1.test1();
		p1.test2();
		System.out.println("heehellllllllllllllllllllooooooooo");
	}
}
//while implenting interface members i  subclass we should defnitely use public keyword 
//here creating obj to P class 
