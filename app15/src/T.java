class  T
{
	public static void main(String[] args) 
	{
		int i=0;
		int j=test1(i++) +  i + test1(++i)  +i+test1(i--)+ i + test1(--i)+i+
//statement:	test(0)          test(2)        test(2)         test(0)   1
//usage :        0          1     2          2              1       
//variable val:  1                2               1                1


			  test2(i++) + i + test2(++i) +i+test2(i--) + i + test2(--i) +i+
//statement:	test(0)       test(2)     
//usage :        0        1       2        2
//variable val:  1                2

			  test3(i++) + i + test3(++i) +i+test3(i--) + i + test3(--i) +i+
//statement:	test(0)       test(2)     
//usage :        0        1       2        2
//variable val:  1                2

			  test4(i++) + i + test4(++i) +i+test4(i--) + i + test4(--i) +i;
//statement:	test(0)       test(2)     
//usage :        0        1       2        2
//variable val:  1                2

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
public static int test3(int i)
	{
        return --i ;
}
public static int test4(int i)
	{
        return i-- ;
}
}
/*output:main end!4,20*/

