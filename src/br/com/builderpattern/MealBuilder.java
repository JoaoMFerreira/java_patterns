package br.com.builderpattern;

public class MealBuilder {

	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurguer());
		meal.addItem(new Pepsi());
		return meal;

	}

	public Meal prepareChickMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurguer());
		meal.addItem(new Coke());
		return meal;

	}
}
