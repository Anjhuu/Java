package github;

public class PgmReturn {
	int a,b,c;
	public  int  add()
	{
		a=10;
		b=20;
		c=a+b;
		return c;
	}

	public static void main(String[] args) {
		PgmReturn s=new PgmReturn();
		System.out.print(s.add());

	}

}
