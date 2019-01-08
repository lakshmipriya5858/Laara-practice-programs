import java.util.HashSet;
class  A
{
	int i;
	int j;
	int k;
	double m;
	A(int i,int j,int k,double m)
	{
	this.i=i;
	this.j=j;
	this.k=k;
	this.m=m;
}
public String toString()
	{
  return "(" + i + " , " + j + " , " +k+ " , " + m+ ")";
}
public int hashCode()
{
		String s1=Integer.toString(i);
		String s2=Integer.toString(j);
		String s3=Integer.toString(k);
		String s4=Double.toString(m);
		int hash=s1.hashCode();
		hash +=s2.hashCode();
		hash +=s3.hashCode();
		hash +=s4.hashCode();
		System.out.println("hashCode for :"+ this +"is "+hash);
		return hash;
	}
	public boolean equals(Object obj)
	{
	boolean flag=(obj instanceof A)&&
                            (i==((A)obj).i)&&
                            (j==((A)obj).j)&&
                            (k==((A)obj).k)&&
                            (m==((A)obj).m);
		System.out.println("equals bw"+this+"and"+obj+":"+flag);
	return flag;
	}
}
class M7
{
	public static void main(String[] args) 
	{
		A a1=new A(90,80,70,100.8);
		A a2=new A(90,80,70,100.8);
		A a3=new A(90,80,170,100.8);
		A a4=new A(90,170,70,100.8);
		A a4=new A(90,170,180,100.8);
		A a4=new A(90,170,90,100.8);
		HashSet set=new HashSet();
		set.add(a1);
		System.out.println("...................................................");
		set.add(a2);
		System.out.println("...................................................");
		set.add(a3);
		System.out.println("...................................................");
		set.add(a4);
		System.out.println("...................................................");
		set.add(a5);
		System.out.println("...................................................");
		set.add(a6);
		System.out.println("...................................................");		
		System.out.println(set);
	}
}


/*
*************inequality purpose we using hashcode 
**IMP*****use equals we can 2 objs hashcode is same ,doesnt required if different ,takes more time ,Expensive operation 
if both objects are same and unable to confirm then use equals 
E:\oct-23\object\app3\src>javac -d ..\classes M6.java

E:\oct-23\object\app3\src>java -cp ..\classes M6

E:\oct-23\object\app3\src>java -cp ..\classes M6
46735459
46735459
46782548
46782517*/