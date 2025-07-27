package com.ok.javainonevedio.oops;
public class Polmorphism {
    public static void main(String[] args) {
        /*
        //Compile-time Polymorphism(Method Overloading)
        Calculator calc = new Calculator();
        System.out.println(calc.add(2,3));//5
        System.out.println(calc.add(1,2,3));//6
    }
}
class Calculator {
    //ADD TWO INTEGERS
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
}
*/
        /*
        class Printer {
            void print(String s) {
                System.out.println("String " + s);
            }

            void print(int i) {
                System.out.println("Integer " + i);
            }

            void print(double d) {
                System.out.println("Double " + d);
            }
        }
        Printer printer = new Printer();
        printer.print("Hello");
        printer.print(100);
        printer.print(3.14);
    }
}
*/
        //Runtime Polymorphism(Method Overriding)
        class Animal {
            void sound() {
                System.out.println("Animal makes a sound");
            }
        }
        class Dog extends Animal{
            void sound(){
                System.out.println("Dog barks");
            }
        }
        class Cat extends Animal {
            void sound(){
                System.out.println("Cat meows");
            }
        }
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        animal1.sound();//Dog barks
        animal2.sound();//Cat meows
    }
}