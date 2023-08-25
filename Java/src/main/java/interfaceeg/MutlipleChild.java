package interfaceeg;

public class MutlipleChild implements InterfaceParents {

	@Override
	public void sum() {
	System.out.println(c);
		
	}

	@Override
	public void print() {
		System.out.println("hello");	
		
	}

	@Override
	public void add() {
		System.out.println("world");
		
	}
public static void main(String args[])
{
	MutlipleChild s= new MutlipleChild();
	s.add();
	s.sum();
	s.print();
	
}
}
