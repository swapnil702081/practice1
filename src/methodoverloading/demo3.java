package methodoverloading;

public class demo3 extends demo2 
{
	public void m1()
	{
		System.out.println("chage in new class");
		
	}
	
	public void m2()
	{
		
		System.out.println("chage");
	}
	
	public static void main(String[] args) 
	{
		
		demo3 d= new demo3();
		d.m1();
		d.m2();
		
		
	}

}
