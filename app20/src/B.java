class  B
{
	int i;
	    B()
	    {
		i=100;	
		}
	public static void main(String[] args) 
	{
		B b1=new B();
				System.out.println(b1.i);
		B b2=new B();
		System.out.println(b2.i);
	}
}
/*
100
100
*/
//constructor should not have return type. 
//constructor executes automatically while obj is created.
//as a non-static initializer.
//it cannot be static 