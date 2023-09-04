package exceptionhandling;

public class ThrowsKey {
	public void add() throws ArithmeticException
	{
		throw new ArithmeticException("invalid");
	}
	public void add3()
	{
	 
	try

	{
	 add();
	}
	catch(ArithmeticException f)
	{
	 System.out.println(f);
	}
	finally
	{
	 System.out.println("not Invalid");
	}

	}
	public static void main(String arg[])
	{
	ThrowsKey s=new ThrowsKey();
	s.add3();

	}

	}



