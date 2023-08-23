package aggregation;

public class Child {
	int value;
	Parent s;
	
		public Child(int value,Parent s)
		{
			this.value=value;
			this.s=s;
		}
		public void print()
		{
			System.out.println(value);
			System.out.println(s.name);
			System.out.println(s.age);
		}
	

	public static void main(String[] args) {
	
Parent o=new Parent(23,"anju");
Child b=new Child(10,o);
b.print();
	}

}
