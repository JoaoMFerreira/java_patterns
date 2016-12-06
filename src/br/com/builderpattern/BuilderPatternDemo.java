package br.com.builderpattern;

public class BuilderPatternDemo {

	public static void main(String[] args) {

		MealBuilder mealBuilder = new MealBuilder();

		Meal vegMeal = mealBuilder.prepareVegMeal();

		System.out.println("Veg Meal");

		vegMeal.showItens();

		System.out.println("Total Cost: " + vegMeal.getCost());

		Meal nonVegMeal = mealBuilder.prepareChickMeal();

		System.out.println("\n\nChick Meal");

		nonVegMeal.showItens();

		System.out.println("Total Cost: " + nonVegMeal.getCost());
	}

}
