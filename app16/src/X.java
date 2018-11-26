class  X//main method can be executed more than 1 time
{
	static int i=test();
	public static int test()
	{
		System.out.println("test begin"+i);
		i+=10;
		main(null);
		System.out.println("test end"+i);
		return i+20;
	}
	public static void main(String[] args) 
	{
		System.out.println(" main"+i);
		i+=5;
		}
}
/*E:\oct-23\app16\src>java -cp ..\classes W
test begin0
 main10
test end15
 main35

*/