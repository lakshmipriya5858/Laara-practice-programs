class F 
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		Class.forName("");          // checked exception classes
		System.out.println(2);
	}
}




/*
D:\nov-15\app3\src>javac -d ../classes F.java
F.java:6: error: unreported exception ClassNotFoundException; must be caught or
declared to be thrown
                Class.forName("");
                             ^
1 error
*/

/*   Class.forName("")    --> under double codes u need to specify whichever the class u need to load
      File IO             --> to interact with the system to read or write 
	  JDBC stmts          -->while interacting with jdbc
	  */
							


/*     all these exception classes are already known to the compiler



statements                                  checked exception
-------------                              ---------------------
Class.forName("")                         ClassNotFoundException                 (if v not provide any calss name under double code we get exception)





File IO                                   IOException, FileNotFoundException


JDBC statements                           SQLEXception




Threads                          |
sleep, join, wait                |        InterruptedException



String -> Date                   |                                                      (converting string to no)
String -> Number                 |        ParseException





cloning                                   CloneNotFoundException                         (when ever object is cloned)




*/