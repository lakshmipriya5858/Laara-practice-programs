class J 
{
	int x;
	public static void main(String[] args) 
	{
		J j1=new J();
		J j2=j1;
		J ref=j1;
		J obj=j2;
	ref.x=100;

		System.out.println(j1.x);
		System.out.println(j2.x);
		System.out.println(ref.x);
		System.out.println(obj.x);
	}
}
/*
100
100
100
100*/