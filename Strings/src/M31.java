class M31
{
	public static void main(String[] args) 
	{
			String s1="Hello";
			String s2= reverse(s1);
			System.out.println(s1);
			System.out.println(s2);

}
}
/*
E:\oct-23\Strings\src>javac -d ..\classes M31.java
M31.java:6: error: cannot find symbol
                        String s2= reverse(s1);
                                   ^
  symbol:   method reverse(String)
  location: class M31
1 error
*/