class S
{
	S()
	{
	System.out.println("S() World!");
	}

	{
		System.out.println("S() World!");
	}

	S(int i)
	{
	this();
	System.out.println("S(int) World!");
	}
}
class T extends S
{
	T()
	{
	this(90);
	System.out.println("t()");
	}
	{
			System.out.println("T-iib");
	}
    T(int i)
	{
	
	System.out.println("t(int)");
	}
}
class U extends T
{
	U()
	{
	super(90);
	System.out.println("U()");
	}
	{
			System.out.println("U-iib");
	}
	U(int i)
	{
	
	System.out.println("U(int)");
	}
}
class V extends U
{
	V()
	{
	super(90);
	System.out.println("U()");
	}

	{
		System.out.println("v-iib");
	}

	V(int i)
	{
	System.out.println("V(int)");
	}
	public static void main(String[] args) 
	{    S s1=new S();
		S s2=new S(10);
		System.out.println("...................");
		T t1=new T(10);
		System.out.println("...................");
       T t2=new T();
		System.out.println("...................");
        U u1=new U(10);
		System.out.println("...................");
		U u2=new U();
		System.out.println("...................");
        V v2=new V(10);
		System.out.println("...................");
	}
}
/*
E:\oct-23\app22\src>java -cp ..\classes V
S() World!
S() World!
S() World!
S() World!
S(int) World!
...................
S() World!
S() World!
T-iib
t(int)
...................
S() World!
S() World!
T-iib
t(int)
t()
...................
S() World!
S() World!
T-iib
t(int)
t()
U-iib
U(int)
...................
S() World!
S() World!
T-iib
t(int)
U-iib
U()
...................
S() World!
S() World!
T-iib
t(int)
U-iib
U()
v-iib
V(int)
...................*/
