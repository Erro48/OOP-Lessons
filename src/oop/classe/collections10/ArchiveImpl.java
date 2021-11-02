package oop.classe.collections10;

import java.util.HashSet;
import java.util.Set;

public class ArchiveImpl implements Archive {
	
	private Set<Person> persons;
	
	public ArchiveImpl() {
		this.persons = new HashSet<Person>();
	}

	@Override
	public void add(String nome, int annoNascita, boolean sposato) {
		persons.add(new Person(nome, annoNascita, sposato));
	}

	@Override
	public void remove(String nome, int annoNascita) {
		this.persons.remove(new Person(nome, annoNascita));
	}

	@Override
	public int size() {
		return this.persons.size();
	}

	@Override
	public Set<String> allMarried() {
		Set<String> married = new HashSet<>();
		
		for (Person p : this.persons) {
			if(p.isMarried()) {
				married.add(p.getName());
			}
		}
		
		return married;
	}

	@Override
	public String toString() {
		String str = "ArchiveImpl [ persons\n{\n";
		for (Person p : this.persons) {
			str += p.toString() + "\n";
		}
		
		str += "}";
		str += ", size=" + this.size() + "]";
		
		return str;
	}

}
