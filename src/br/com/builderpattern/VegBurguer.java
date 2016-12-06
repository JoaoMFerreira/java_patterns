package br.com.builderpattern;

public class VegBurguer extends Burger{

	@Override
	public String name() {
		return "VegBurguer";
	}

	@Override
	public float price() {
		return 50.5f;
	}

}
