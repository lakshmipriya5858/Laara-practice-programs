class A 
{
	int i;
	public String toString()
	{
	return "i="+ i;
	}
}
class M4
{
	public static void main(String[] args) 
	{
		A a1=new A();
		a1.i=10;
	System.out.println(a1);
	}
}
/*
E:\oct-23\exception\app5\src>java -cp ..\classes M1
A@15db9742


a1 and a2 are refering /pointinng to same obj

*/