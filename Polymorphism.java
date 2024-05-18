package com.aadi.methodsW3;


class Animal {//Create class animal
	public void animalSound() {//Create first method
		System.out.println("The animal makes a sound");
	}
}

	
	class Dog extends Animal{//Child class of Animal
	public void animalSound() {//Call first method
		System.out.println("The dog says: bow wow");
	}
		
		
	}
class Polymorphism{//Main class
	public static void main(String[]args) {//Spot to run code
		
		Animal myAnimal = new Animal();//Create objects
		Animal myDog = new Dog();
		
		myAnimal.animalSound();//Call classes
		myDog.animalSound();
}
}

