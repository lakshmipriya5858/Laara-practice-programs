class  S
{
	public static void main(String[] args) 
	{
		int i=0;
		int j=test1(i++)+ i + test1(++i)+i+
//statement:	test(0)       test(2)     
//usage :        0        1       2        2
//variable val:  1                2
			  test2(i++) + i + test2(++i) +i;
//statement:	test(2)       test(4)     
//usage :        3        3        5        4
//variable val:  3                4
	System.out.println("main end!"+i+","+j);
	}
	public static int test1(int i)
	{
        return i++;
}
public static int test2(int i)
	{
        return ++i ;
}
}
/*output:main end!4,20*/

