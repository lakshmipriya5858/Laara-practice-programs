class M15
{
	public static void main(String[] args) 
	{
		String s1=null;
		String s2=s1+s1;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.length());
		System.out.println(s2.length());
	}
}
/*


E:\oct-23\Strings\src>java -cp ..\classes M15
null
nullnull
Exception in thread "main" java.lang.NullPointerException
        at M15.main(M15.java:9)
*/