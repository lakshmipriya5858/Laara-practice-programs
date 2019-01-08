class  M1
{
	public static void main(String[] args) 
	{
		int i= 10;
		Integer obj1= new Integer(i);  //boxing
		Integer obj2= Integer.valueOf(i); // boxing
     // static value of method.
		int j= obj1.intValue();         // unboxing
		int k = obj2.intValue();       // unboxing
		System.out.println("Hell");
	}
}
// for every primitive there is a wrapper class.
// int is a datatype while Integer is a class.
// for boxing purpose u can use constructr or static value of method.
//
