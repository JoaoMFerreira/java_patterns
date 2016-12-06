package br.com.singletonpattern;

public class SingleObjectDemo {

	
	public static void main(String[] args) {
		
		SingleObject a = SingleObject.getInstance();
		
		a.addCount(new Integer(2));
		
		a.showMessage();
		
		
		SingleObject b = SingleObject.getInstance();
		
		b.showMessage();
		
	}
	
}
