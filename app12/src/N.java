class N
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i=1;
		while(i<=5)
		System.out.println("loop body begin"+i);
        i++;//not part of while 
		System.out.println("main end");
	}
}}
//infinte loop