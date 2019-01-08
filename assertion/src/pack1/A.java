package pack1;
class A 
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		assert false;  //by deflut assert stmts r not executing.
		System.out.println(2);
	}
}
/*
//compiles sucessfully.
//by defult all assert stmts are disabled
//assert stmt is used for rising an error when ever condition is failure.
//assertions are introduced in JDK 1.4
//assert is a keyword from JDK 1.4
//before JDK1.4 assert is chosen as a identifier.
//there are 2 types of assert stmt:
       1.very simple assert stmt:--> 
	        [VSA]  
	   assert boolean_result
	   2. SA
	   ----------------
	   assert boolean_result : some message;

	 -ea      (or)   -enableassertions  //it's used to activate assert.

	 -da       (or)  -disableassertions // it's to disable the assert.

	 enable/disable
	 --------------
	 1.execution wise
	 2.package & its sub packages wise
	 3.class wise.