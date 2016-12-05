package br.com.joao.singletonpattern;

public class SingleObject {

	private static SingleObject instance = new SingleObject();
	
	private static Integer count = 0;
	
	private SingleObject(){
		
	}
	
	public static SingleObject getInstance(){
		return instance;
	}
	
	
	public void showMessage(){
		System.out.println("HelloWorld: "+ count);
	}
	
	public Integer addCount(Integer a) {
		
		if(a != null){
			return count =+ a;
		}
		
		return null;
	}
}
