package superkey;

public class SuperChild extends SuperKey{
	public void sum()
	{
		super.add();
		System.out.println("sum of two numbers"+super.a);
	}

	public static void main(String[] args) {
		SuperChild s=new SuperChild();
		s.sum();
		//s.add();

	}

}
