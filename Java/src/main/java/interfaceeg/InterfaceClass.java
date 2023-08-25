package interfaceeg;

public class InterfaceClass implements InterfaceEg  {
	public void add()
	{
		int c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		InterfaceClass s= new InterfaceClass ();
		s.add();
		System.out.println(s.b);

	}

}
