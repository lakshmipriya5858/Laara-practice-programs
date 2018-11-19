 class H
{
	public static void main(String[] args) 
	{
		System.out.println("main  begin:");
		int i=1;
		do
		{
			
		System.out.println("loop body 1"+i);
		if(i==3)
	    {
		continue;
		}
		System.out.println("loop end  1"+i);
        i++;
		}
		while (i<=5);
		System.out.println("main  end!"+i);
	}
}