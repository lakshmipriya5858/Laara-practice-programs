class C 
{
	public static void main(String[] args) 
	{
		int i=4;
		int j=(i<5)?100:200;
		if(i<5)
		{
			j=100;
		}else
		{
			j=200;
		}
		System.out.println(i+","+j);
	}
}
