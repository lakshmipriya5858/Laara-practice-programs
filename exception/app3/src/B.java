class B
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		test();
		System.out.println(2);
	}
	public static void test() 
	{
		System.out.println(3);
		int i = 10 / 0;           
		System.out.println(4);
	}
}

// run time is pure unchecked compiler doest have information about this this will get mature while running ,
 compilation very sucesses without try catch and throws  , compiler not asking us to keep try catch
// raised exception not handled at line no 12, exception object is propegated to caller of method line no 6, 
there is no try catch to handle therefore forcefully terminating
/*
D:\nov-15\app3\src>javac -d ../classes B.java

D:\nov-15\app3\src>java -cp ../classes B
1
3
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at B.test(B.java:12)
        at B.main(B.java:6)
		*/