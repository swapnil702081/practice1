package methodoverloading;

public class demo1 
{
	public static void m1(String name, int a)
	{
		
		System.out.println(name);
		System.out.println(a);
	}
   
	public static void m1(String sname, char age)
	{
		
		System.out.println(sname);
		System.out.println(age);
		
	}
	
	
	
	public static void main(String[] args) 
	{
		
		m1("swapnil", 10);
		m1("amol", 24);
		
	}
}
