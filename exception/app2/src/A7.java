class A7
{
	int test(boolean flag)
	{
	if (flag)
	{
			return 20;
	}
	else
		{
return 10;
		}
		return 30;//never execute 
	}
}
/*E:\oct-23\exception\app2\src>javac -d ..\classes A7.java
A7.java:13: error: unreachable statement
                return 30;
                ^
1 error
*/