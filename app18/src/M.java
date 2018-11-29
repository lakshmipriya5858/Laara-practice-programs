class M 
{
	public static void main(String[] args) 
	{
		System.out.println("M.main World!");
		System.out.println(L.X);//uses previous classL values 
		System.out.println("M. World!");
	}
}
/*E:\oct-23\app18\src>java -cp ..\classes M
M.main World!
20
M. World!*/
