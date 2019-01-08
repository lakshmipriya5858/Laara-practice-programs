class A 
{
int i;
A(int i)
	{
this.i=i;
}
}
class M15
{
	public static void main(String[] args) 
	{
		A a1=new A(50);
		A a2=new A(50);
		A a3=a1;
		System.out.println(a1==a2);
		System.out.println(a1==a3);
	}
}
//out:false
      // true
//double equals
//a1 to one obj
//a2 to another we are geting false  
//a1 and a3 pointing same obj getting true 