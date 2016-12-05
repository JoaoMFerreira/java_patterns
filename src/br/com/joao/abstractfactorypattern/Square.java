package br.com.joao.abstractfactorypattern;

import br.com.joao.abstractfactorypattern.Shape;

public class Square implements Shape{

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
		
	}

}
