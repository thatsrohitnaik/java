package firstApp;

public class singletonmain {
	public static void main(String args[]) {
		
		Singleton s1= Singleton.getInstance();
		s1.doThis();
		s1.set(10);
		int num=s1.get();
		System.out.println(num);
		Some s= new Some();
		
	}

}

class Some{
	
	Some(){
		Singleton s1= Singleton.getInstance();
//		s1.doThis();
//		s1.set(10);
		int num=s1.get();
		System.out.println("someeee"+num);
	}
}

class Singleton {
	int num=0;
	
	public static Singleton singleton = new Singleton();
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		
		return singleton;
	}
	public void doThis() 
	{
		System.out.println("doing it");
	}
	public void set(int num) {
		this.num=num;
	}
	public int get() {
		return num;
	}
	
}