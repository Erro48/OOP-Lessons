package oop.polymorphism;

public class Zoo {
	private final Animal[] animals;

	public Zoo(final int size) {
		super();
		this.animals = new Animal[size];
	}
	
	public void addAnimal(final Animal animal, final int position) {
		this.animals[position] = animal;
	}
	
	public void showAnimals() {
		for (Animal animal : this.animals) {
			if (animal != null) {
				animal.speak();
			}
		}
	}
	
}
