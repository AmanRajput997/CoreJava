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

   Operators : 
Java supports various operators to perform operations on variables.

   • Arithmetic: +, -, *, /, % (modulo)

   • Bitwise: & (AND), | (OR), ^ (XOR), ~ (NOT), << (left shift), >> (right shift)

   • Relational & Logical: ==, !=, >, <, && (AND), || (OR), ! (NOT)

   Arrays : 
An array is a data structure that stores a fixed-size, sequential collection of elements of the same data type.


2. Object-Oriented Programming (OOPs) 🏛️: The Core Paradigm

   OOPs is a programming model based on the concept of "objects," which can contain data and code.

Class & Object
• Class: A blueprint for creating objects. It defines properties (fields) and behaviors (methods).

• Object: An instance of a class.

Encapsulation 💊:
Encapsulation is the practice of bundling data (fields) and the methods that operate on that data into a single unit (a class). It restricts direct access to data, protecting it from accidental modification. This is achieved using access modifiers like private.

Inheritance 🧬:
Inheritance allows a class (child/subclass) to inherit fields and methods from another class (parent/superclass). It promotes code reusability. Java does not support multiple inheritance (a class cannot extend more than one class).

Polymorphism 🎭:
Polymorphism ("many forms") allows methods to do different things based on the object it is acting upon.

• Compile-Time Polymorphism (Method Overloading): Methods in the same class share the same name but have different parameters (different number or type of arguments).

• Runtime Polymorphism (Method Overriding): A subclass provides a specific implementation of a method that is already defined in its superclass.

Abstraction 👻:
Abstraction hides complex implementation details and shows only the essential features of the object. It's achieved using abstract classes and interfaces.

• Abstract Class: A class that cannot be instantiated. It can have both abstract methods (without a body) and concrete methods. Subclasses must implement the abstract methods.

• Interface: A completely abstract "class" that is used to group related methods with empty bodies. A class can implement multiple interfaces, which is how Java solves the multiple inheritance problem.


3. Java Collection Framework (JCF) 🗃️: Managing Data
   The JCF provides a set of interfaces and classes to help you manage groups of objects efficiently.

• List: An ordered collection that allows duplicate elements.

 • ArrayList: A resizable array. Fast for random access (get).

 • LinkedList: A doubly-linked list. Fast for insertions and deletions.

• Set: A collection that does not allow duplicate elements.

 • HashSet: Stores unique elements in an unordered fashion. Very fast for lookups (contains).

• LinkedHashSet: Stores unique elements and maintains the order of insertion.

• Map: An object that maps keys to values. Keys must be unique.

• HashMap: Stores key-value pairs in an unordered fashion. Provides fast retrieval based on the key.

4. Multithreading 🚀: Doing Things in Parallel:
Multithreading allows a program to execute multiple threads (lightweight processes) concurrently, improving performance and responsiveness.

Key Concepts
• Process: An instance of a program being executed.

• Thread: The smallest unit of execution within a process. A process can have multiple threads.

• Multitasking: The ability of an OS to run multiple processes (or threads) simultaneously.

Creating Threads
1.Extending the Thread Class: Create a new class that extends Thread and override its run() method.

2.Implementing the Runnable Interface: Create a class that implements Runnable, then pass an instance of it to a new Thread object. (This is generally preferred).

Synchronization
When multiple threads access a shared resource (like a variable), it can lead to a race condition. The synchronized keyword ensures that only one thread can execute a block of code or a method at a time, preventing data corruption.


Performance Example :
The provided code in the multithreading package compares a task done sequentially (withoutMultiThreading) versus concurrently (withMultiThreading). The multithreaded version typically finishes much faster because the two main tasks (sum calculation and number counting) run at the same time on different CPU cores. This demonstrates the power of parallel execution.





