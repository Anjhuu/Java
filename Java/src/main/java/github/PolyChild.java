package github;

public class PolyChild extends Poly{
	public void sum()
	{
		super.sum();//calling the parent object using super keyword
		System.out.print("world");
	}

	public static void main(String[] args) {
		PolyChild s= new PolyChild();
		s.sum();
Poly a=new Poly();//calling parent process using object creation
a.sum();
		//PolyChild b=new Poly ();
//b.sum();
	}

}
