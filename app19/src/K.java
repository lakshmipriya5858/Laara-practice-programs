class K
{
	int x;
	public static void main(String[] args) 
	{
		K k1=new K();
		k1.x=200;
        K k2=new K();
		k2.x=400;
		System.out.println(k1.x);
		System.out.println(k2.x);
		k1.x=300;
System.out.println(k1.x);
		System.out.println(k2.x);
	}
}
//can create any num of objects for one class
/*
200
400
300
400
*/