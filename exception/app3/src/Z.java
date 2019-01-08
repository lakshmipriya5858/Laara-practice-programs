class A
{
	A() throws ClassNotFoundException
	{
	}
}
class Z extends A 
{
	Z() throws ClassNotFoundException          
	{
	}

	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}

// if super class constr is throwing checked exception the sub class constr also should through same checked exception bcz we cannt keep try catch bcz super will become 3rd stmt which is not posible

/*
D:\nov-15\app3\src>javac -d ../classes Z.java

D:\nov-15\app3\src>java -cp ../classes Z
done
*/