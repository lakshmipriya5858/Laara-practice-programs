class I 
{
	int x;
	public static void main(String[] args) 
	{
		I obj1=new I();
		I obj2=obj1;//to where obj1 pointing obj2 also should point 
		obj2.x=10;
		System.out.println(obj1.x);
		System.out.println(obj2.x);
	}
}
//10
//10
//imp