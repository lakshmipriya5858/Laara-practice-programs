class A 
{
	void test1()
	{
	
	}
	void test2() throws ClassNotFoundException
	{
	}
	void test3() throws NullPointerException
	{
	}
	void test4() throws CloneNotSupportedException
	{
	}
	void test5() throws java.io.IOException
	{
	}
	void test6() throws Exception
	{
	}
	
	
	
	 
}
//throws is mainly introduced for checked it doesnt required for unchecked 
//still if we want we can incorporate 
/****************principles to be followed :significance of throws while overriding a  method
1.any method can be overridided in the subclass without a throws
2.while method is overriding in subclass we can choose  any throws  unchecked (means compiler not at all verifying)
3.if we are overriding a method witha checked then super class method also should be same checked */
