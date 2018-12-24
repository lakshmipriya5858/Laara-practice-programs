class  A
{
	static 
	{
			System.out.println("A-sib");
	}
}
class W extends A
{
	static
	{
		System.out.println("W-sib");
	}
	public static void main(String[] args) 
	{
		System.out.println("W-main");
	}
}
/*E:\oct-23\app22\src>java -cp ..\classes W
A-sib
W-sib
W-main



//sib s are not inheriting to sub class
	//A sib not inherited to w class
	//A class sib remains in a class only
	//while loading w it will checks a loaded or not
	//if not loaded yet A loaded operation
	// w is depending on a
*/