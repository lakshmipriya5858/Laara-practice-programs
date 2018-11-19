class M
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i=1;
		first:
		while(i<=5)
		{
		System.out.println("loop body begin"+i);
		for(int j=50;j<=55;j++){
		System.out.println("loop body begin "+i+","+j);
		if(j==52)
			{
			i++;
		     continue first;
		}
		System.out.println("loop body end "+i+","+j);

		}
		System.out.println("loop body end"+i);
		i++;
	    }
				System.out.println("main end"+i);
	}
}/*main begin
loop body begin1
loop body begin 1,50
loop body end 1,50
loop body begin 1,51
loop body end 1,51
loop body begin 1,52
loop body begin2
loop body begin 2,50
loop body end 2,50
loop body begin 2,51
loop body end 2,51
loop body begin 2,52
loop body begin3
loop body begin 3,50
loop body end 3,50
loop body begin 3,51
loop body end 3,51
loop body begin 3,52
loop body begin4
loop body begin 4,50
loop body end 4,50
loop body begin 4,51
loop body end 4,51
loop body begin 4,52
loop body begin5
loop body begin 5,50
loop body end 5,50
loop body begin 5,51
loop body end 5,51
loop body begin 5,52
main end68*/