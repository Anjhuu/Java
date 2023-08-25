package finalkey;

public class FinalKey {
	final int a=10;
	public void print()
	{
		System.out.println("hello");
	}

	public static void main(String[] args) {
		FinalKey b=new FinalKey();
		b.print();
		System.out.print(b.a);
	}

}
