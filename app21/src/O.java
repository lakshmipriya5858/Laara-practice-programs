class O
{
	static int count;
	
	
	
	O()
	{

	}
	O(int i)
	{
		this();

	}
	{
		count ++;
	}
	
	
	public static void main(String[] args) 
	{
		O l1=new O();
		O l2=new O(20);
		O l3=new O();
		System.out.println(O.count);
	}
}
//3
