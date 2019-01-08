class M25
{
	public static void main(String[] args) 
	{
			String s1=new String("hellohello");
			System.out.println(s1);
			int i=s1.indexOf('e',4);
			System.out.println(i);
			 i=s1.indexOf('l',6);
			System.out.println(i);
			 i=s1.indexOf('H',7);
			System.out.println(i);

}
}
/*

E:\oct-23\Strings\src>javac -d ..\classes M25.java

E:\oct-23\Strings\src>java -cp ..\classes M25
hellohello
6
7
-1
*/