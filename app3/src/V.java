class  V
{
	public static void main(String[] args) 
	{
		int i=0;
		int j=i++ + i + i++ + i + i++ + i +
			\\ 0    1    1    2    2    3
			  i++ + i++ + i++ + i++ + i++ + i +
			\\ 3    4      5     6     7    8
			i-- + i-- + i-- + i-- + i-- + i+
			\\8    7     6     5    4    3
			i-- + i + i-- + i + i-- + i +
     \\      3    2   2    1    1     0
			++i + i + i-- + i + ++i + i + 
\\            1    1   1    0    1     1            
            ++i + --i + i-- + i-- + ++i + --i + i;
		      2     1   1     0     1      0    1
		\\   
				System.out.println(i);

		System.out.println(j);

	}
}
