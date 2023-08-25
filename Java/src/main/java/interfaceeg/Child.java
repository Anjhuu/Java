package interfaceeg;

public class Child implements Parent {
	public void add()
	{
		System.out.println("hello");
	}

	public static void main(String[] args) {
		Parent s=new Child();
		s.add();
		
	}

}
