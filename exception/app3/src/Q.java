class Q 
{
	public static void main(String[] args) throws ClassNotFoundException
	{
		System.out.println("done");
	}
}

//v.imp 1st 2 points remember
// remember any method can throw any checked exception
// even constr also can through checked exception

// even though method doesnt have any checked exception it can through ClassNotFoundException



// if catch is ClassNotFoundException try cannt be empty

/*
D:\nov-15\app3\src>javac -d ../classes Q.java

D:\nov-15\app3\src>java -cp ../classes Q
done
*/