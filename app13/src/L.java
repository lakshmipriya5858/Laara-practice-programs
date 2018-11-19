 class L
{
	public static void main(String[] args) 
	{
		System.out.println("main  begin:");
		int i=1;
		do
		{	
		System.out.println("loop body 1"+i);
		int j=10;
		while(j<=15)
			{
		System.out.println("inner loop body begin"+i+","+j);
		if(j==13)
				{
			j++;
		continue;
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