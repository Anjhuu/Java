package homework;

public class HomeSuper extends  SuperHw {
	int s;
	public void add()
	{
	s=super.c;
	int b=s%10;
		 
		 if(b==0)
			{
				System.out.println("sum is divisible by 10");
			}
		 else {
			 System.out.println("sum is not divisible by 10");
			 
		 }
		
	}

	public static void main(String[] args) {
		
		HomeSuper b= new HomeSuper();
		b.sum();
		b.add();
		
	}

}
