class Z22
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for(int i=1;i<=5;i++);//loop ending without body
					System.out.println("loop1 body stmt 1:"+i);
		            System.out.println("main begin");
	}
}
//compile time error ,i cannot be used after for loop