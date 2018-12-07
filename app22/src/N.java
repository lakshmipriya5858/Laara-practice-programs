class  K
{
	K()
	{
	System.out.println("K()");
	}
}

class L extends K
{
	L()
	{    
		System.out.println("L()");
	}
}

class M extends L
{
	M()
	{    
		this(90);
		System.out.println("M()");
	}
	M(int i)
	{    
		System.out.println("M(int)");
	}
}

class N extends M
{
    N()
	{    
		super(10);
		System.out.println("N()");
	}
    N(int i)
	{    
		System.out.println("N(int)");
	}  
	public static void main(String[] args) 
	{
      K k1=new K();
      System.out.println("..........................");		
      L l2=new L();
	  System.out.println("..........................");		
      M m1=new M();
	  System.out.println("..........................");	
	  M m2=new M(10);  
	  System.out.println("..........................");
      N n1=new N();
	  System.out.println("..........................");	
	  N n2=new N(20);
	  System.out.println("..........................");
    }
}
/*
E:\oct-23\app22\src>java -cp ..\classes N
K()
..........................
K()
L()
..........................
K()
L()
M(int)
M()
..........................
K()
L()
M(int)
..........................
K()
L()
M(int)
N()
..........................
K()
L()
M(int)
M()
N(int)
..........................*/
//there is a built in class like a string -----------Object class

//constructors are not inherited in subclass in this code