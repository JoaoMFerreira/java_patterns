package br.com.joao.builderpattern;

import java.util.ArrayList;
import java.util.List;

public class Meal {

	private List<Item> itens = new ArrayList<Item>();

	public void addItem(Item item) {
		itens.add(item);
	}

	public float getCost() {
		float coast = 0.0f;
		coast = (float) itens.stream().mapToDouble(p -> p.price()).sum();
		return coast;
	}

	public void showItens() {
		for (Item item : itens) {
			System.out.print("Item: " + item.name());
			System.out.print(", Packing: " + item.packing().pack());
			System.out.println(", Price: " + item.price());
		}

	}
}
