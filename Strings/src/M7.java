class M7
{
	public static void main(String[] args) 
	{
		String s1=null;
		int i=s1.length();
		System.out.println(i);
	}
}
/*
E:\oct-23\Strings\src>java -cp ..\classes M7
Exception in thread "main" java.lang.NullPointerException
        at M7.main(M7.java:6)
		*/