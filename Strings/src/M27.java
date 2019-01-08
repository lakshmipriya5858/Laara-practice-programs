class M27
{
	public static void main(String[] args) 
	{
			String s1=new String("hellohello");
			System.out.println(s1);
			int i=s1.indexOf("llo");
			System.out.println(i);
			 i=s1.lastIndexOf("hello");
			System.out.println(i);
			 i=s1.lastIndexOf("Hllo");
			System.out.println(i);

}
}
/*

E:\oct-23\Strings\src>java -cp ..\classes M27
hellohello
2
5
-1
*/