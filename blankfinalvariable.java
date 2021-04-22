class fin 
{ 
	final int i; 

	fin(int x) 
	{
		i = x; 
	} 
}
class finn 
{ 
	public static void main(String args[]) 
	{ 
		fin o1 = new fin(100); 
		System.out.println(o1.i); 

		fin o2 = new fin(200); 
		System.out.println(o2.i); 
	} 
}