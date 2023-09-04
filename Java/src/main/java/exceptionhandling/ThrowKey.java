package exceptionhandling;

public class ThrowKey {
	public void add() {
		int m=15;
		if(m>=18)

	{
			System.out.println("Eligibile for voting");
			}
		else
		{
			throw new ArithmeticException("not eligibile for voting");
		}
	}

	public static void main(String[] args) {
		ThrowKey t= new ThrowKey();
		t.add();

	}

}
