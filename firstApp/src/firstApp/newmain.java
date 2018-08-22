package firstApp;

public class newmain {

	public static void main(String args[]) 
	{
		B ah = new B(10);
		
	}
}
class A{
	int a;
	A(int a){
		this.a=a;
		System.out.println("super clASS"+this.a);
	}
}
class B extends A{

	B(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}
	
}