class M17
{
	public static void main(String[] args) 
	{
		String s1="java";
		String s2=s1+10;
		String s3=s1+10+10;
		String s4=10+10+s1;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		}
}
/*

E:\oct-23\Strings\src>javac -d ..\classes M16.java

E:\oct-23\Strings\src>java -cp ..\classes M16
java
java
java1010
20java
*/