package encapsulation;

public class Encap1 {
private int a;
private String s;
public void setter(int a,String s) {
this.a=a;
this.s=s;
}
public void getter()
{
	System.out.print(a+" "+s);
}
}