package pack1;//specify package with the name of the folder
class A 
{
	public static void main(String[] args) 
	{
		System.out.println("pack1.A");
	}
}
/*E:\oct-23\app23\src>javac -d ../classes pack1/A.java
   //while compiling automatically creating
E:\oct-23\app23\src>java -cp ..\classes pack1.A
pack1.A
*/