class  A
{
	int i;
	A(int i)
	{
	this.i=i;
	}
}
class	M2
{
	public static void main(String[] args) 
	{
		A a1=new A(90);
		A a2=a1;
		System.out.println(a1.equals(a2));
	}
}
/*out:true

obj.equals method checking only memory address
a1 & a2 both pointing to same obj a2 ,becoz of same obj 
so true 
object class internally using equals operator 
*/