package com.ok.javainonevedio.oops;

public class Abstraction {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sayBye();
        dog.sleep();
    }
}
 abstract class Animal {
    String color;
    boolean hasSuperpower;
    public Animal(){
        hasSuperpower = false;

    }
    abstract void sayHello();
    abstract void sayBye();
    void sleep(){
        System.out.println("zzz...");
    }
}
class Dog extends Animal {
    @Override
    void sayHello() {
        System.out.println("Woof");

    }

    @Override
    void sayBye() {
        System.out.println("Woof");

    }

}
