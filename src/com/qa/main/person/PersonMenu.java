package com.qa.main.person;

import java.util.Scanner;

public class PersonMenu {
	private PersonManager pm;
	private Scanner s;
	
	public PersonMenu(PersonManager pm) {
		this.pm = pm;
	}
	
	public void run() {
		this.s = new Scanner(System.in);
		boolean flag = true;
		do {
			System.out.println("------------MENU------------");
			System.out.println();
			System.out.println("CREATE PERSON        : A");
			System.out.println("OUTPUT ALL PEOPLE    : B");
			System.out.println("SEARCH FOR PERSON    : C");
			System.out.println("----------------------------");
			
			String choice = s.nextLine();
			s.nextLine();
			
			if(choice.equals("A")) {
				createPerson();
			}else if(choice.equals("B")) {
				outputAllPeople();
			}else if(choice.equals("C")) {
				searchForPerson();
			}
			
			System.out.println("Exit Menu? (y/n)");
			String exit = s.next();
			s.nextLine();
			
			if(exit.equalsIgnoreCase("y")) {
				System.out.println("--Exiting Menu--");
				flag = false;
			}else if(exit.equalsIgnoreCase("n")){
				System.out.println("--Returning to Menu--");
			}
		}while(flag);
		s.close();
	}
	
	public void createPerson() {
		System.out.println("CREATING NEW PERSON....");
		System.out.println("Input person's full name: ");
		String pname = s.nextLine();
		s.nextLine();
		System.out.println("Input person's age: ");
		int age = s.nextInt();
		s.nextLine();
		System.out.println("Input person's job title: ");
		String jobtitle = s.nextLine();
		s.nextLine();
		
		pm.addPerson(new Person(pname,age,jobtitle));
		System.out.println("Person: "+pname+" added to Person Manager: \n"+pm);
	}
	
	public void outputAllPeople() {
		System.out.println("OUTPUTTING ALL PEOPLE IN PERSON MANAGER....");
		System.out.println(pm.toString());
	}
	
	public void searchForPerson() {
		System.out.println("SEARCHING FOR PERSON....");
		System.out.println("Input name of person to be searched: ");
		String searchname = s.nextLine();
		s.nextLine();
		
		System.out.println(pm.getPersonFromName(searchname));
	}
}
