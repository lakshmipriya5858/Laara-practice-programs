class M
{
	static int count;
	
	
	
	M()
	{
	count ++;
	}
	M(int i)
	{
	count ++;
	}
	public static void main(String[] args) 
	{
		M l1=new M();
		M l2=new M(20);
		M l3=new M();
		System.out.println(M.count);
	}
}
//3
