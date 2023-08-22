package acessmodifier;

public class AccessmodifierTypes {
	public void sum()
	{
		System.out.println("public method");
	}
private void add()
{
	System.out.println("private method");

}
protected void print()
{
	System.out.println("protected method");
}
void sub()
{
	System.out.println("default method");
}
	public static void main(String[] args) {
	
		AccessmodifierTypes a= new AccessmodifierTypes();
		a.sum();
		a.add();
		a.print();
		a.sub();
	}

}
