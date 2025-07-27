package com.ok.javainonevedio.dataTypes;

import org.w3c.dom.ls.LSOutput;

public class Test {
   public static void main(String[] args) {
       /*
       //String Creation Methods
       String s1 = "Hello";//string literal
       String s2 = new String("Hello");//using constructor
       //Object Creation
       Test = new Test();//JVM has the space to store object i.e,stack and heap memory allocating(string pool)
       */
       /*
       //String Pool Vs Heap
       int a =1;//Stores in stack
       String str1 = "Hello";//Stores in heap(String pool) and the Hello is stored in some location and str1 is pointing to him.
       String str2 = "Hello";
       String str3 = new String("Hello");
       System.out.println(str1 == str2);//true(same reference in pool)
       System.out.println(str1 == str3);//false(different value
       System.out.println(str1.equals(str3));
        */
       /*
       //String Immutability
       String a ="Hello";
       String b =a.toUpperCase();
       System.out.println(a);
       System.out.println(b);
       */
       /*
       //Common String Operations
       String text = "Hello Harley";
       //Length
       System.out.println(text.length());//12
       //Accessing characters
       System.out.println(text.charAt(8));//r
       //Substring
       System.out.println(text.substring(6,12));//Harley
       //Contains, stratswith, endswith
       System.out.println(text.contains("Hello"));//true
       //Replace
       String newText = text.replace("Hello", "How are you");
       System.out.println(newText);//How are you Harley
        */
      //Arithmetic Operators
       /*
       int a = 5 + 3;//8
       int b = 10 - 4;//6
       int c = 3 * 6;//18
       float d = 10 / 3;//3.0
       double e = 10.0 / 3.0;//3.3333333333333335
       int f = 10 % 3;//1
       System.out.println(a);
       System.out.println(b);
       System.out.println(c);
       System.out.println(d);
       System.out.println(e);
       System.out.println(f);
       a += 5;
       System.out.println(a);
       int x = 5;
       x++;//post increment
       System.out.println(x);//6
       ++x;//pre increment
       System.out.println(x);//7
       x--;//post decrement
       System.out.println(x);//6
       --x;//pre decrement
       System.out.println(x);//5
       int z = 1;
       //System.out.println(z++ + z);//1 + 2
       System.out.println(z++ + --z);//1 + 1
       */
      //int a = 2;
      //int b = 33;
      //int c = a*b;
      //System.out.println(c);
      //System.out.println(Integer.toBinaryString(a));
      //Bitwise Operator
       /*
       int a = 5;//0101
       int b = 3;//0011
       //AND Operator(&)
       System.out.println("AND Operation:");
       System.out.println("5 & 3 = " +(a & b));
       System.out.println("Binary:" +Integer.toBinaryString(a&b));
       //OR Operator(|)
       System.out.println("\nOR Operation:");
       System.out.println("a | b = " +(a|b));
       System.out.println("Binary:" +Integer.toBinaryString(a|b));
       //XOR Operator(^)
       System.out.println("\nXOR Operation:");
       System.out.println("a ^ b = " +(a^b));
       System.out.println("Binary:" +Integer.toBinaryString(a^b));
       //Not operator(~)
       System.out.println("\nNOR Operation:");
       System.out.println("~5 = " +(~a));
       System.out.println("Binary:" +Integer.toBinaryString(~a));
       //Left Shift
       System.out.println("\nLeft Shift:");
       System.out.println("5 << 1 =" + (a << 1));
       System.out.println("Binary:" +Integer.toBinaryString(a << 1));
       //Right Shift
       System.out.println("\nRight Shift:");
       System.out.println("5 >> 1 =" + (a >> 1));
       System.out.println("Binary:" +Integer.toBinaryString(a >> 1));
       */
      //Conditional Statements
      //1)Relational Operators--> They return boolean result
       /*
       System.out.println(1<2);
       System.out.println(1 == 2);
       System.out.println( 1 != 2);
       System.out.println(1 != 2 && 1 <2);
        */
      //2)Logical Operators--> used to combine multiple boolean expression
       /*
       boolean isSunny = true;
       boolean isWarm = true;
       // AND Operator(&&)
       boolean isGoodBeachDay = isSunny && isWarm;
       System.out.println("Is it a good beach day?" +isGoodBeachDay);
       //OR Operator(||)
       boolean isRaining = false;
       boolean isSnowing = true;
       boolean isBadWeather = isRaining || isSnowing;
       System.out.println("Is the weather bad?"+isBadWeather);
       //Not Operator(!)
       boolean a = false;
       System.out.println(!a);
       */
       /*
       boolean isSunny = true;
       boolean isWarm = false;`
       if(isSunny){
           System.out.println("Beach day");
       }
       if(isSunny && isWarm){
           System.out.println("BEACH DAY");
       } else System.out.println("Ghar me baithiye");
       */
      //Arrays:-> An array in java is a data structure that stores a fixed-size sequential collection of elements of the same type
      //Declaration an array must be declared with a specific data type
      //int[] number;
      //Creation arrays are created using the new keyword, and their size is specified
      //int[] a = new int[5];
      //_,_,_,_,_ OR 0,0,0,0,0
      //System.out.println(a[1]);
      //a[4] = 55;
      //System.out.println(a[4]);
      //for(int i =0;i<5; i++) {
      //   System.out.println(a[i]);
      //}
      //for(int i :a){// for each loop
      //    System.out.println(i);
      //}
      //int[] a = {1,2,4,56,2};//intialization
      /*Object
      Car car = new Car();
      Car.speed =110;
      Car.color ="Green";
      car.drive();
       */
      /*
      Encapsulation
      Car car = new Car("Green");
      car.setSpeed(-12);
      car.setSpeed(12);
       */
      /*
      Inheritance
      -->Multilevel
      Child child = new Child();
      child.name = "Ram";
   }
}
class Child extends parent{
        }
class parent extends GrandParent{
}
class GrandParent{
   String name;
}
*/
      /* Does not only Multiple Inhertiance, Solution for this is (INTERFACE)
      SmartPhone smartphone = new SmartPhone();
      smartphone.capture();
      smartphone.turnOn();
   }
}
class Camera{
   void capture() {
      System.out.println("Photo clicking..");
   }
   void turnOn() {
      System.out.println("Photo turing..");
   }
}
class MusicPlayer{
   void playMusic() {
      System.out.println("Music playing..");
   }
   void turnOn() {
      System.out.println("MusicPlayer turing..");
   }

}
class Phone{
   void call(String number) {
      System.out.println("Phone calling.." + number);
   }
   void turnOn() {
      System.out.println("Phone turing..");
   }
}
class SmartPhone extends Camera{

}
*/
   }
}
