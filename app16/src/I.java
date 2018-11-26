class I 
{
	static int i=1000;//global
	public static void main(String[] args) 
	{
		boolean i=false;//local
		System.out.println("Hello World!"+i);
	}
}
//E:\oct-23\app16\src>java -cp ..\classes I
//Hello World!false