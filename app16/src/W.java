class W //main method can be executed more than 1 time
{
	static int i=test();
	public static int test()
	{
		System.out.println("test begin");
		main(null);
		System.out.println("test end");
		return 100;
	}
	public static void main(String[] args) 
	{
		System.out.println(" main"+i);
		}
}
/*E:\oct-23\app16\src>java -cp ..\classes W
test begin
 main0
test end
 main100

*/