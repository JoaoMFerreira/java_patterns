package br.com.joao.factorypattern;

import br.com.joao.abstractfactorypattern.Shape;

public class Rectangle implements Shape{

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
		
	}

}
