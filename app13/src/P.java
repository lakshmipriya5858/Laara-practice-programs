 class P
{
	public static void main(String[] args) 
	{
		System.out.println("main  begin:");
		int i=1;
		abc:
		do
		{	
		System.out.println("loop body 1"+i);
		int j=10;
		xyz:
		while(j<=15)
			{
		System.out.println("inner loop body begin"+i+","+j);
		if(j==15)
				{
			
		continue abc;
		}
		System.out.println("inner loop body begin"+i +","+j);
		j++;
		}
		System.out.println("loop end  1"+i);
		}
		while (i++<=5);
		System.out.println("main  end!"+i);
	}
}