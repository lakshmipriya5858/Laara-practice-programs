class J
{
	static int i=1000;//global
	public static void main(String[] args) 
	{
		boolean i=false;//local
		System.out.println("Hello World!"+i);
		System.out.println("Hello World!"+J.i);
	}
}
/*E:\oct-23\app16\src>java -cp ..\classes J
Hello World!false
Hello World!1000*/