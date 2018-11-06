class H 
{
	public static void main(String[] args) 
	{
		int i=0;
		System.out.println(true||i++ == 0);

		System.out.println(i);//printed 0 as in case of 0r||any one true it is true so second condition not executed

	}
}
