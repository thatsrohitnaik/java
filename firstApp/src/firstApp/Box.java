package firstApp;

public class Box {
	
	Box(String hmm){
		System.out.println(hmm);
	}
	
	int length;
	int height;
	int calculateArea() {
		return length*height;
	}

}
