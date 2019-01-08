class test 
{
	public static void method1(Object obj) 
	{
		C c1= (C) obj;
		System.out.println("Hell");
	}
	public static void method2(Object obj) // sstd method
	{
		if( obj instanceof A)
		{
			A a1= (A) obj;
		System.out.println(" able to cast into A type");
		}
		if( obj instanceof B)
		{
			B b1= (B) obj;
		System.out.println(" able to cast into B type");
		}
		if( obj instanceof C)
		{
			C c1= (C) obj;
		System.out.println(" able to cast into C type");
		}
       if( obj instanceof D)
		{
			D d1= (D) obj;
		System.out.println(" able to cast into D type");
		}
		if( obj instanceof E)
		{
			E e1= (E) obj;
		System.out.println(" able to cast into E type");
		}

	}
}
// argumnt is a object tye
//we are down casting it blindly(for method 1)