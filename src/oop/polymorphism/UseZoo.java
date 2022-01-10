package oop.polymorphism;

public class UseZoo {

	public static void main(String[] args) {
		final Zoo zoo = new Zoo(5);

		zoo.addAnimal(new Dog(), 0);
		zoo.addAnimal(new Dog(), 1);
		zoo.addAnimal(new Shark(), 2);
		zoo.addAnimal(new Bird(), 3);
		
		zoo.showAnimals();
	}

}
