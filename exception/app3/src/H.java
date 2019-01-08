class H 
{
	public static void main(String[] args) throws ClassNotFoundException
	{
		System.out.println(1);
		Class.forName("");
		System.out.println(2);     // not executed
	}
}

//throws only for checked exception
// asume v dont want to handle we can go for without try and catched but it is mandatory for checked exception
// throws key word introduced for checked


// exception object is propagating to main method caller

/*
D:\nov-15\app3\src>javac -d ../classes H.java

D:\nov-15\app3\src>java -cp ../classes H
1
Exception in thread "main" java.lang.ClassNotFoundException:
        at java.lang.Class.forName0(Native Method)
        at java.lang.Class.forName(Class.java:264)
        at H.main(H.java:6)
*/