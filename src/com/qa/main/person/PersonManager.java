package com.qa.main.person;

import java.util.ArrayList;
import java.util.List;

public class PersonManager {
	
	private List<Person> people = new ArrayList<>();

	public List<Person> getPeople() {
		return people;
	}

	public void addPerson(Person person) {
		people.add(person);
	}
	
	public String getPersonFromName(String name) {
		for(Person p : people) {
			if(p.getName().equals(name)) {
				return p.toString();
			}
		}
		return "Person does not exist";
	}
	
	public void removePerson(Person person) {
		people.remove(person);
	}
	
	public String getPerson(Person p) {
		return p.toString();
	}
	
	public String toString() {
		String out = "";
		for(Person p : people) {
			out += p.toString() + "\n";
		}
		return out;
	}
}
