class M20
{
	public static void main(String[] args) 
	{
		String s1=null;
		String s2=s1+10;
		String s3=null+s1;
		String s4="10"+20;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		}
}
/*
E:\oct-23\Strings\src>javac -d ..\classes M20.java

E:\oct-23\Strings\src>java -cp ..\classes M20
null
null10
nullnull
1020
*/