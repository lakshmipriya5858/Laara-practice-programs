import java.io.Closeable;
class H implements Closeable 
{
	public  void close() 
	{
		System.out.println("from close!");
	}
}
//its a functional interface which is containing close method 