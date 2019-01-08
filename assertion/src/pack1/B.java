package pack1;
class B 
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		assert true;  
		System.out.println(2);
	}
}
/*
output:
D:\java\assertion\src>javac -d ../classes pack1/B.java

D:\java\assertion\src>java -cp ../classes pack1.B
1
2

D:\java\assertion\src>java -cp ../classes -ea pack1.B
1
2
*/