package br.com.builderpattern;

public class ChickenBurguer extends Burger{

	@Override
	public String name() {
		return "Chiken Burguer";
	}

	@Override
	public float price() {
		return 25.5f;
	}

}
