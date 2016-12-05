package br.com.joao.abstractfactorypattern;

import br.com.joao.abstractfactorypattern.Shape;

public class Circle implements Shape{

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
		
	}

}
