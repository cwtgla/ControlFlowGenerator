import java.util.List;

import org.eclipse.jdt.core.dom.Statement;


public class TestClass
{
	int a, b, c, d;
	String ab, cd;
	
	public TestClass(int a)
	{
		a=0;b=1;c=2;d=3;
		
		ab="Bob";
		cd="Craig";
		
		verify();
		
		for(int i=0; i < 10; i++)
		{
			System.out.println(i);
		}
		
		for(int i=0;i <10;i++)
		{
			System.out.println(i);
			System.out.println(i+1);
		}
		int max;
		max = (a > b) ? a : b;
		
		do
		{
			System.out.println(a);
		}
		while(a > 0);
		
		a=7;
		b=a;
		
		try
		{
			System.out.println("a");
			
		}
		catch(Exception e)
		{
			System.out.println("caught");
		}
		finally
		{
			System.out.println("d");
		}
	}
	
	private void verify()
	{
		int a[] = new int[10];
		
		int a[] = {1,2,3};
				
		if(ab.equals(cd))
		{
			System.out.println("woops");
			System.out.println("2");
			System.out.println("3");
		}
		else
		{
			System.out.println("fail");
		}
		
		if(false)
			System.out.println("another test");
		else
			System.out.println("test3");
		
		if(ab == ab)
		{
			System.out.println("ab");
		}
		else if(ab != ab)
		{
			System.out.println("another");
		}
		else if(ab == ab)
		{
			System.out.println("finally");
		}
		
	}
	
	public static void main(String[] args)
	{
		TestClass test;
		test = new TestClass(9);
		
		test.print1();
		test.print2();
		test.print3("Bob");
		test.print4();
		
		if(false)
		{
			System.out.println("done");
		}
	}

	private void print4()
	{
		System.out.println("nothing");
		
		print3();
	}

	private void print3(String name)
	{
		System.out.println(name);	
	}

	private void print2()
	{
		System.out.println("nothing");
	}

	private void print1()
	{
		System.out.println("nothing");
	}
}
