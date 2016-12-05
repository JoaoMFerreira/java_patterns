package br.com.joao.abstractfactorypattern;

public class FactoryProducer {

	
	public static AbstractFactory getFactory(String choice){
		
		if(choice != null){
			
			if(choice.equalsIgnoreCase("shape")){
				return new ShapeFactory();
			}else if(choice.equalsIgnoreCase("color")){
				return new ColorFactory();
			}
			
		}
		return null;
		
	}
	
}
