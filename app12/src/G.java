class G
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
			break;// infinte execution 
		}
				System.out.println("loop body end");
                 i++;
	    }
				System.out.println("main end"+i);

}}
