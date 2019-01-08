package pack1;
class K
{
	public static void main(String[] args) 
	{
	    int	assert = 10;
		System.out.println(assert);
	}
	
}
//CTE.
//v can't use a assert as a identifier.
/*
D:\java\assertion\src>javac -d ../classes pack1/K.java
pack1\K.java:6: error: as of release 1.4, 'assert' is a keyword, and may not be used as an identifier
            int assert = 10;
                ^
  (use -source 1.3 or lower to use 'assert' as an identifier)
pack1\K.java:7: error: as of release 1.4, 'assert' is a keyword, and may not be used as an identifier
                System.out.println(assert);
                                   ^
  (use -source 1.3 or lower to use 'assert' as an identifier)
2 errors
*/
/*
D:\java\assertion\src>javac -d ../classes -source 1.3 pack1/K.java
D:\java\assertion\src>java -cp ../classes pack1.K
10
*/