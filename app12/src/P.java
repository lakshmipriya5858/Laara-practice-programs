class P
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i=1;
		while(i<=5);//no chnace of increment i value
		System.out.println("loop body begin"+ i++);
        System.out.println("main end"+i);
	}
}
//main begin
//while loop doesnt have a body