package com.qa.main.greeter;

public class Greeter {
	
	private Greeting greeting;
	
	public String greet() {
		return greeting.greet();
	}
	
	public Greeter(Greeting greeting) {
		this.greeting = greeting;
	}

	public Greeting getGreeting() {
		return greeting;
	}

	public void setGreeting(Greeting greeting) {
		this.greeting = greeting;
	}

}
