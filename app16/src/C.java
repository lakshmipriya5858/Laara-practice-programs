class C
{
	static int i=10;//intializers
	static int j;   //initialized with default value 
	static int k=0;//initializer
	public static void main(String[] args) 
	{
		System.out.println(i+","+j+","+k);
		i=1;
		j=2;
		k=3;
		System.out.println(i+","+j+","+k);

	}
}
//10,0,0
//1,2,3