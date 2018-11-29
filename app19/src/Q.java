class Q
{
	int i=10;

	public static void main(String[] args) 
	{
		Q q1=new Q();
		System.out.println(q1.i);
		q1.i=20;
		q1=new Q();//after this first object is not reffer 
		System.out.println(q1.i);
	}
}
//10
//10