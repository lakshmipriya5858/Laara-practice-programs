class A 
{
	int test(int i)
	{
			System.out.println("A test(int)!");
			return 1;
	}
}
class N extends A
{
	int test(int i,int j)
	{
			System.out.println("M test(int,int)!");	
			return 10;
	}
	public static void main(String[] args) 
	{
		N obj=new N();
		obj.test(10);
		System.out.println("done");
	}
}
/*
E:\oct-23\app28\src>java -cp ..\classes N
A test(int)!
done*/
//inherited method is over loading 