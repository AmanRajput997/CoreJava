Core Java Concepts: A Practical Guide 🧑‍💻 : 


Welcome! This repository contains a collection of Java files designed to explain the fundamental concepts of Core Java, from basic syntax to more advanced topics like Object-Oriented Programming (OOPs), the Collection Framework, and Multithreading. Each concept is demonstrated with simple, commented code.

Table of Contents : 
 1. Java Fundamentals

 2. Object-Oriented Programming (OOPs)

 3. Java Collection Framework (JCF)

 4. Multithreading

1. Java Fundamentals: Basics & Building Blocks 🧱
    These are the absolute essentials you need to start writing Java code.
   
    Strings : Strings in Java are objects that represent a sequence of characters. A key feature is their immutability—once a String object is created, it cannot be changed.

    String Pool vs. Heap:

     • Literals (String s1 = "Hello";) are stored in a special memory area called the "String Pool." If another string literal with the same value is created, it will point to the same object.

     • Objects created with new (String s2 = new String("Hello");) are stored in the main heap memory, creating a new object every time.
