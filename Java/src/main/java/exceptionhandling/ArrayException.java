package exceptionhandling;

public class ArrayException {
	public void add()
	{
		try {
		int a[]= {1,2,3,5,6};
		System.out.println(a[10]);
	}
		/*catch(Exception g) {
		System.out.println("invalid input");
		}*/
		catch(ArithmeticException e){
			
			System.out.println("arithmetic");	
		}
		catch(ArrayIndexOutOfBoundsException f){
			System.out.println("array out of bounds");
			
		}
			
		}
	public static void main(String[] args) {
		
		ArrayException t=new ArrayException();
		t.add();
	}

}