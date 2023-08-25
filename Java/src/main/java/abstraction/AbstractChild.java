package abstraction;

public class AbstractChild extends AbstractClass {
	public void sum()
	{
		System.out.println("Abstract method");
	}

	public static void main(String[] args) {
		AbstractChild s= new AbstractChild();
		s.add();
		s.sum();

	}

}
