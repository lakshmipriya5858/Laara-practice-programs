class V
	{
	static int i=test();
	static int j=test();
	public static int test()
	        {
			System.out.println("test"+i+j);
             return i+j+10;
			}
	public static void main(String[] args) 
	{
		System.out.println("main:"+i+j);
	}
}
/*

E:\oct-23\app16\src>java -cp ..\classes V
test00
test100
main:1020
*/