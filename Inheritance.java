package com.aadi.methodsW3;

public class Inheritance {
	protected String name1 = "Name: Joe";
	public void age() {
		System.out.println("Method: I am 10 years old");
	}
	
}

class Person extends Inheritance{
	
	private String nickname = "Nickname: John";
	
	public static void main(String[]args) {
		Person myPerson = new Person();
		myPerson.age();
		System.out.println(myPerson.nickname+", "+myPerson.name1);
	}
}
