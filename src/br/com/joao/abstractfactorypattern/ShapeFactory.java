package br.com.joao.abstractfactorypattern;

import br.com.joao.abstractfactorypattern.Shape;

public class ShapeFactory extends AbstractFactory{

	@Override
	public Shape getShape(String shapeType) {

		if (shapeType == null) {
			return null;
		}

		if (shapeType.equalsIgnoreCase("circle")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("rectangle")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("square")) {
			return new Square();
		}

		return null;
	}

	@Override
	Color getColor(String color) {
		return null;
	}

}
