interface A
{
  void test1();
} 
class O implements A
{
    public void test1()
	{
		System.out.println("o-test1()");
	}
	public static void main(String[] args) 
	{
		O o1=new O();
		o1.test1();
		System.out.println("heehellllllllllllllllllllooooooooo");
	}
}
//by default interface methods and attributes are static and final without refernce 