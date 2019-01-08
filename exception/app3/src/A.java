class A 
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		int i = 10 / 0;
		System.out.println(2);
	}
}

// arithmetic is a runtime exception and it is unchecked 

/*
D:\nov-15\app3\src>java -cp ../\classes A
1
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at A.main(A.java:6)
*/