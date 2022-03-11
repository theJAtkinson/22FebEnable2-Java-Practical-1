package com.qa.main.person;

import java.util.ArrayList;
import java.util.List;

public class Person {
	private List<Person> people = new ArrayList<>();
	
	private String name;
	private int age;
	private String jobtitle;
	
	public Person(String name, int age, String jobtitle) {
		this.name = name;
		this.age = age;
		this.jobtitle = jobtitle;
	}
	
	@Override
	public String toString() {
		return ("Person's name is: " + name + ", their age is " + age +  ", their job title is: " + jobtitle);
	}
	
	public void fillPeople() {
		Person john = new Person("John Smith", 35, "CEO");
		Person sally = new Person("Sally Robinson", 26, "CEO (as well)");
		Person tyler = new Person("Tyler Bradley", 50, "Janitor in chief");
		people.add(john);
		people.add(sally);
		people.add(tyler);
	}
	
	public void addPerson(Person person) {
		people.add(person);
	}
	
	public String getPerson(String name) {
		for(Person p : people) {
			if(p.name.equals(name)) {
				return p.toString();
			}
		}
		return "Person does not exist";
	}
}
