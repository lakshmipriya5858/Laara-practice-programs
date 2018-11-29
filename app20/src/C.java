class  C
{
	int i;
	    C(int x)
	    {
		i=x;	
		}



	public static void main(String[] args) 
	{
		C c1=new C(90);
				System.out.println(c1.i);
		C c2=new C(190);
		System.out.println(c2.i);
	}
}
/*
90
190*/
//constructor should not have return type. 
//constructor executes automatically while obj is created.
//as a non-static initializer.
//it cannot be static 