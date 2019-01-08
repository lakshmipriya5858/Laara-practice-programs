class A 
{
int i;
A(int i)
	{
this.i=i;
}
}
class M16
{
	public static void main(String[] args) 
	{
		A a1=new A(50);
		A a2=new A(50);
		A a3=a1;
		System.out.println(a1==a2);
		System.out.println(a1==a3);
		System.out.println(a1.i==a2.i);//we are appling values (compare with values)
	}
}
//out:false
      // true
	  // true
//double equals operator while using for reference variable it  is not checking content it is checking memory addrress 
//a1 to one obj
//a2 to another we are geting false  
//a1 and a3 pointing same obj getting true 