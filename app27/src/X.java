interface A
{
  void test1();
} 
class D
{
 public void test1()
	{
 		System.out.println("D-test1()");
    }
}
class  X extends D implements A
{
	public static void main(String[] args)
	{
		X obj=new X();
		obj.test1();
		System.out.println("done()");
	}
}
