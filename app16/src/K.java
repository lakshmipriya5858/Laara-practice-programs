class K
{
	static int i=1000;//global
	public static void main(String[] args) 
	{
		boolean i=false;//local
		System.out.println("Hello World!"+i);
		System.out.println("Hello World!"+K.i);
		i=true;
		K.i=3000;
		System.out.println("Hello World!"+i);
		System.out.println("Hello World!"+K.i);
	}
}
/*E:\oct-23\app16\src>java -cp ..\classes K
Hello World!false
Hello World!1000
Hello World!true
Hello World!3000*/