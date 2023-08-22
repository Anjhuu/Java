package github;

public class PolyChild extends Poly{
	public void sum()
	{
		super.sum();
		System.out.print("world");
	}

	public static void main(String[] args) {
		PolyChild s= new PolyChild();
		s.sum();

	}

}
