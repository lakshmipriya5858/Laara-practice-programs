class G 
{
	static
	{
		System.out.println(i); // direct read.
	}
	static int i;

	static
	{
		System.out.println(i);
	} // direct read.
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}
