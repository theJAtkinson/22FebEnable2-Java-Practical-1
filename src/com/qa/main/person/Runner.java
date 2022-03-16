package com.qa.main.person;

public class Runner {

	public static void main(String[] args) {
		
		Person john = new Person("John Smith", 35, "CEO");
		Person sally = new Person("Sally Robinson", 26, "CEO (as well)");
		Person tyler = new Person("Tyler Bradley", 50, "Janitor in chief");
		PersonManager a = new PersonManager();
		
		a.addPerson(john);
		a.addPerson(sally);
		a.addPerson(tyler);
		
		PersonMenu pm = new PersonMenu(a);
		
		pm.run();

	}

}
