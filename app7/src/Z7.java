class Z7
{
	public static void main(String[] args) 
	{
		 System.out.println("main begin");
		 if(false)                      //if-false goes to else block
		 System.out.println("if block");
		 else if (false)                //Body of else block has ifelse  block receivinf false in if and goes to else block 
		 System.out.println("else if");
	     else if(false)              //Body of this else block having only if (block) receiving false and if block does not executes
		 System.out.println("else if else if ");
	     System.out.println("main end ");
	}
}
			
			