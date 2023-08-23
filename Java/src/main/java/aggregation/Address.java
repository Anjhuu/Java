package aggregation;

public class Address {
	String add;
	Student s;
	public Address(String add,Student s)
	{
		this.add=add;
		this.s=s;
	}
public void print()
{
	System.out.print("name of student is "+s.name+",roll no is "+s.roll+" and address is "+add);
}
	public static void main(String[] args) {
		Student a= new Student(15,"anju");
		Address b=new Address("tc 43/720 poomuttam line valiyasala",a);
		b.print();

	}

}
