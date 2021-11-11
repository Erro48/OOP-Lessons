package oop.exercises.archive;

public class Person {
	
	private final String name;
	private final int annoNascita;
	private boolean married;
	
	public Person(String name, int annoNascita, boolean married) {
		this.name = name;
		this.annoNascita = annoNascita;
		this.married = married;
	}
	
	public Person(String name, int annoNascita) {
		this.name = name;
		this.annoNascita = annoNascita;
	}

	public String getName() {
		return this.name;
	}

	public int getAnnoNascita() {
		return this.annoNascita;
	}

	public boolean isMarried() {
		return this.married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + annoNascita;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (annoNascita != other.annoNascita)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	public String toString() {
		return "Person [" + getName() + " " + getAnnoNascita() + " " + (isMarried() ? "sposato" : "scapolo") + "]";
	}
	
}
