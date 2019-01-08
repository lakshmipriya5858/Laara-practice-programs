package pack1;
import pack1.pack11.M;
import pack2.N;
import pack2.pack22.O;
class  L
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		assert false;
		System.out.println(2);
		pack1.pack11.M.test2();
		System.out.println(3);
		pack2.pack22.O.test4();
		System.out.println(4);
		pack2.N.test3();
		System.out.println(5);
	}
}
//compiles sucessfully.
/*
D:\java\assertion\src>javac -d ../classes pack1/L.java

D:\java\assertion\src>java -cp ../classes pack1.L
1
2
pack1.pack11.M.test2 begin
pack1.pack11.M.test2 end
3
pack2.pack22.O.test4 begin
pack2.pack22.O.test4 end
4
pack2.N.test3 begin
pack2.N.test3 end
5
*/