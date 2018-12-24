class A 
{
	void test()
	{
		System.out.println("A-test()!");	
	}
}
class W extends A
{
	void test()
	{
		System.out.println("w-test()");
	
	}
    public static void main(String[] args) 
	{
		W w1=new W();
		w1.test();
	}
}
/*

E:\oct-23\app28\src>java -cp ..\classes W
w-test()
*/
//a class test method got over ride in Wclass 