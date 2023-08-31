package exceptionhandling;

public class TryCatch {
	public void add()
	{
		try
		{
	int a=10/0;
	System.out.println(a);
		}
		catch(Exception f)
		{
			System.out.println(f);	
		}
	}

	public static void main(String[] args) {
		TryCatch t=new TryCatch();
		t.add();
	}

}
