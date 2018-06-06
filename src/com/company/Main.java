package com.company;

public class Main {

    public static void main(String[] args) {
	//my cat

    Cat myCat = new Cat("Eden","Indy", 9, 'm',"Louisville",true,12.8);

    System.out.println("The name of my cat is: "+ myCat.getPetName());

    myCat.setWhiskers(true);
    System.out.println("Does this cat have whiskers? "+ myCat.isWhiskers());

    System.out.println(myCat.makeSound());

    System.out.println(myCat.catYears());

    }
}
