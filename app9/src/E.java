class E 
{
	enum Test{CON1,CON2,CON3,CON4,CON5,CON6};//Enums used to group multiple constants together
	public static void main(String[] args) 
	{
		System.out.println(Test.CON1.ordinal());//ordinal method gets enum constant index value
		System.out.println(Test.CON2.ordinal());
		System.out.println(Test.CON3.ordinal());
		System.out.println(Test.CON4.ordinal());
		System.out.println(Test.CON5.ordinal());
		System.out.println(Test.CON6.ordinal());
	}
}
/*
1.byte
2.short
3.ascii code for char
4.hashcode of String
5.index of enum constant 
6.int itself 
*/