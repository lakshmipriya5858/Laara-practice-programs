package pack1;
class C 
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		assert false: "somthing went wrong";  
		System.out.println(2);
	}
}
/*
output:
D:\java\assertion\src>javac -d ../classes pack1/C.java

D:\java\assertion\src>java -cp ../classes pack1.C
1
2

D:\java\assertion\src>java -cp ../classes -ea pack1.C
1
Exception in thread "main" java.lang.AssertionError: somthing went wrong
        at pack1.C.main(C.java:7)
*/