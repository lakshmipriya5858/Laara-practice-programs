class F
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i=1;
		while(i<=5)
		{
		System.out.println("loop body"+i);
		if(i==3)
			{
			i++;
			continue;
		     }
			 System.out.println("loop body end");
				i++;
	     }
				System.out.println("main end"+i);

      }     
}
//chnages rdone before continue if i++ will not b there we will be getting infiniteloop