class N
{
	static int count;
	
	
	
	N()
	{

	}
	N(int i)
	{

	}
	{
		count ++;
	}
	
	
	public static void main(String[] args) 
	{
		N l1=new N();
		N l2=new N(20);
		N l3=new N();
		System.out.println(N.count);
	}
}
//3
//instead of using count ++ which is common code in every constructors use iib and use common code in IIB
//As iib exceute for every obj creation
