package homework;

public class HomeWorkc extends HomeworkChild {
	float total;
	public void print()
	{
		super.sum();
		total=(dp+hr-pf-dp+bonous);
		System.out.println("the total salary is : "+total);
	}

	public static void main(String[] args) {
		
		 HomeWorkc s=new HomeWorkc();
		 
		 s.sum();
		 s.print();
	}

}
