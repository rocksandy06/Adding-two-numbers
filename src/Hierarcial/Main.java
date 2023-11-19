package Hierarcial;

//Parent class
class Animal {
 public void eat() {
     System.out.println("Animal is eating.");
 }
}

//Child class 1
class Dog extends Animal {
 public void bark() {
     System.out.println("Dog is barking.");
 }
}

//Child class 2
class Cat extends Animal {
 public void meow() {
     System.out.println("Cat is meowing.");
 }
}

//Main class
public class Main {
 public static void main(String[] args) {
     Dog dog = new Dog();
     dog.eat(); // Inherited from Animal class
     dog.bark(); // Unique to Dog class

     Cat cat = new Cat();
     cat.eat(); // Inherited from Animal class
     cat.meow(); // Unique to Cat class
 }
}