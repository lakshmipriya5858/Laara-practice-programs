class  G
{
	void test()
	{
		System.out.println("from test");
	}
	public static void main(String[] args) 
	{
		System.out.println("main  begin!");
		G g1=new G();
		g1.test();
		System.out.println("main  end!");

	}
}
/*E:\oct-23\app19\src>java -cp ..\classes G
main  begin!
from test
main  end!*/