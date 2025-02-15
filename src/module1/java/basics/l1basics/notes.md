## Notes------>

// Core Java Interview Questions and Answers

// Q1: What are the main principles of OOP (Object-Oriented Programming)?
// A1: The main principles of OOP are:
// 1. Encapsulation - Wrapping of data (fields) and methods in a single unit (class).
// 2. Inheritance - Mechanism for a class to inherit properties and behavior from another class.
// 3. Polymorphism - Ability to take many forms, such as method overloading and overriding.
// 4. Abstraction - Hiding implementation details and exposing only the essential features.

// Q2: What is the difference between JDK, JRE, and JVM?
// A2:
// - JDK (Java Development Kit): Provides tools for developing Java applications, including a compiler, JRE, and
debugging tools.
// - JRE (Java Runtime Environment): Provides libraries and the JVM to execute Java programs. It does not include
development tools.
// - JVM (Java Virtual Machine): It executes Java bytecode and provides the environment for Java program execution.

// Q3: What is the difference between "=="" and "equals()" in Java?
// A3:
// - "==" is used to compare object references or primitive values. For example `a == b` checks if both variables refer
to the same memory location.
// - "equals()" is a method used to compare object content, typically overridden in classes like String and custom
classes.

// Q4: What is the difference between Checked and Unchecked Exceptions?
// A4:
// - Checked Exceptions: Exceptions that are checked at compile-time (e.g., IOException, SQLException).
// - Unchecked Exceptions: Exceptions that occur at runtime (e.g., NullPointerException,
ArrayIndexOutOfBoundsException).

// Q5: What are Threads in Java, and why are they used?
// A5: Threads in Java are lightweight processes used for achieving multitasking. They allow a program to perform
multiple tasks concurrently, utilizing CPU efficiently.

// Q6: What is the difference between "String", "StringBuilder", and "StringBuffer"?
// A6:
// - String: Immutable, every modification creates a new object.
// - StringBuilder: Mutable, not thread-safe, performs better in a single-threaded environment.
// - StringBuffer: Mutable, thread-safe (synchronized), used when multiple threads need safe access.

// Q7: What is a Java Stream in Java 8+?
// A7: Streams are used to process collections of data in a functional-style programming manner. They support operations
like filter(), map(), forEach(), etc.

// Example:
List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
numbers.stream()
.filter(n -> n % 2 == 0)
.forEach(System.out::println); // Prints even numbers

// Q8: What is the purpose of the "final" keyword in Java?
// A8:
// - final class: Prevents inheritance (e.g., `final class Example { }`).
// - final method: Prevents the method from being overridden.
// - final variable: Prevents the variable value from being changed after initialization.

// Q9: What is the function of the "static" keyword in Java?
// A9: "static" is used to indicate that a field or method belongs to the class rather than an instance. It's shared
among all instances of the class.

// Q10: Explain Garbage Collection in Java.
// A10: Garbage Collection (GC) in Java is the process of automatically managing memory by removing unreferenced
objects. It prevents memory leaks and optimizes memory usage.
65:
// Q11: What is a Constructor in Java?
66:// A11: A Constructor is a special method in a class that is used to initialize objects. It has the same name as the
class
67:// and no return type. Types:
68:// - Default Constructor: No arguments provided explicitly.
69:// - Parameterized Constructor: Takes arguments to initialize fields.
70:
71:// Q12: What is the "super" keyword in Java?
72:// A12: The `super` keyword is used to refer to the immediate parent class in a class hierarchy. Common uses:
73:// - Access parent class methods or fields.
74:// - Call parent class constructors (using `super()`).
75:
76:// Q13: What are Java Annotations?
77:// A13: Java Annotations are metadata attached to classes, methods, fields, or parameters. Examples include:
78:// - @Override: Indicates a method overrides a superclass method.
79:// - @Deprecated: Marks a method as obsolete.
80:// - @FunctionalInterface: Marks an interface with exactly one abstract method.
81:
82:// Q14: Differences between Abstract Class and Interface?
83:// A14:
84:// - Abstract Class: Can have both abstract and concrete methods, allows private and protected methods, and supports
85:// single inheritance.
86:// - Interface: All methods are abstract (Java 7). From Java 8 onward, default and static methods are allowed. It
supports
87:// multiple inheritance.
88:
89:// Q15: Can an interface extend multiple interfaces in Java?
90:// A15: Yes, an interface can inherit multiple interfaces in Java. For example:
91:// interface A { void methodA(); }
92:// interface B { void methodB(); }
93:// interface C extends A, B { void methodC(); }
94:
95:// Q16: What is the role of the "this" keyword in Java?
96:// A16: The `this` keyword is used to refer to the current object instance. Common uses:
97:// - Differentiate between instance variables and local variables.
98:// - Pass the current object as a method argument or constructor.
99:
100:// Q17: What is the difference between "wait()" and "sleep()" in Java?
101:// A17:
102:// - `wait()`: Used in multi-threading to release the lock or monitor. Needs to be called inside synchronized
blocks.
103:// - `sleep()`: Suspends thread execution for a specific duration. The thread does not release the lock.
104:
105:// Q18: What are the main features introduced in Java 8?
106:// A18: Java 8 introduced these key features:
107:// - Lambda Expressions
108:// - Streams API
109:// - Functional Interfaces
110:// - Default and Static Methods in Interfaces
111:// - Optional Class, Date-Time API
112:
113:// Q19: What is the "finalize()" method in Java?
114:// A19: The `finalize()` method is called by the Garbage Collector before the destruction of objects, allowing for
cleanup.
115:// It is rarely used.
116:
117:// Q20: What is an Inner Class in Java?
118:// A20: Inner Classes are defined within another class. Types:
119:// - Static Nested Class
120:// - Non-Static Inner Class (Member Class)
121:// - Anonymous Inner Class
122:
123:// (Remaining Q&As Placeholder - To be continued for Q21 to Q100)
// Q21: What is the difference between "HashMap" and "Hashtable"?
// A21:
// - HashMap: Not synchronized, allows one null key and multiple null values, faster in non-threaded environments.
// - Hashtable: Synchronized, does not allow any null keys or null values, slower due to thread-safety.
// Q22: What is the use of "Constructor Overloading" in Java?
// A22: Constructor Overloading allows creating multiple constructors with different signatures in the same class,
// enabling the initialization of objects in various ways.
// Q23: What is the difference between method overloading and method overriding?
// A23:
// - Overloading: Same method name with different parameter lists (compile-time polymorphism).
// - Overriding: Subclass provides a specific implementation for a method in the parent class (runtime polymorphism).
// Q24: What are Generics in Java?
// A24: Generics enable types (classes and methods) to operate on parameters of different types while providing type
safety.
// Example: List<String> ensures only String elements can be added.
// Q25: What is the Singleton Design Pattern?
// A25: The Singleton Pattern ensures that a class has only one instance during the application lifecycle. Example:
// class Singleton {
// private static Singleton instance;
// private Singleton() { }
// public static Singleton getInstance() {
// if (instance == null) {
// instance = new Singleton();
// }
// return instance;
// }
// }
// Q26: What is the importance of the "transient" keyword in Java?
// A26: The `transient` keyword is used to indicate that a field should not be serialized as part of the object state
// during serialization.
// Q27: What is the difference between an Array and ArrayList in Java?
// A27:
// - Array: Fixed size, can store both primitive and object types.
// - ArrayList: Dynamic size, can only store objects.
// Q28: What is a "static block" in Java?
// A28: A `static block` is used to initialize static variables or execute static initialization code. It is executed
// when the class is loaded into memory.
// Q29: What are the differences between Collection and Collections in Java?
// A29:
// - `Collection`: An interface in `java.util` package, which is the root of the collection framework.
// - `Collections`: A utility class in the `java.util` package that contains static methods for working with
collections.
// Q30: What is Exception Handling in Java?
// A30: Exception Handling is a mechanism to handle runtime errors using constructs like `try`, `catch`, `finally`,
`throw`,
// and `throws` to maintain application flow.
// Q31: What is the difference between "throw" and "throws" in Java?
// A31:
// - `throw`: Used to explicitly throw an exception.
// - `throws`: Used in method declaration to specify exceptions that a method might throw.
// Q32: What are Java Enumerations (Enums)?
// A32: Enums are special classes introduced in Java 5 used to define a fixed set of constants. Example:
// `enum Days { MONDAY, TUESDAY, WEDNESDAY }`
// Q33: What is the difference between "HashSet" and "TreeSet"?
// A33:
// - HashSet: Does not maintain order, uses hashing for storage.
// - TreeSet: Maintains elements in sorted order using a red-black tree structure.
// Q34: What is a "Marker Interface"?
// A34: A Marker Interface is an empty interface (no methods) used to provide metadata to classes. Example:
// `Serializable` and `Cloneable`.
// Q35: What is the "default" keyword in Java 8 interfaces?
// A35: The `default` keyword is used to create a default method in interfaces, allowing it to have a body without
// affecting implementing classes.
// Q36: What is the difference between "ArrayList" and "LinkedList"?
// A36:
// - ArrayList: Stores elements in contiguous memory, faster for random access.
// - LinkedList: Stores elements as nodes, faster for insertion and deletion.
// Q37: What is Polymorphism in Java?
// A37: Polymorphism allows an entity (method or object) to behave differently based on its implementation. Types:
// - Compile-time (Method Overloading)
// - Runtime (Method Overriding)
// Q38: What are Functional Interfaces in Java?
// A38: A Functional Interface has exactly one abstract method and can be used with lambda expressions. Example:
// `@FunctionalInterface interface MyFunction { void doSomething(); }`
// Q39: What is the difference between "Serializable" and "Externalizable"?
// A39:
// - Serializable: Uses Java's default serialization process.
// - Externalizable: Provides control over the serialization process by implementing `readExternal` and
// `writeExternal`.
// Q40: Explain the Java Memory Model.
// A40: Java Memory Model defines how threads interact with memory and what behaviors are allowed in multi-threaded
// environments. It includes heap, stack, and method areas.
// Q41: What is the role of the "volatile" keyword in Java?
// A41: The `volatile` keyword ensures visibility of changes to a variable across threads and prevents instruction
reordering.
// Q42: Compare "synchronized" vs "ReentrantLock" in Java.
// A42:
// - Synchronized: Simpler syntax, automatically releases the lock.
// - ReentrantLock: Provides advanced functionality like tryLock(), lockInterruptibly(), fairness policies.
// Q43: What is a Deadlock in Java?
// A43: Deadlock occurs when two or more threads are blocked forever, each waiting for the other to release a lock.
// Q44: What are the advantages of the Stream API?
// A44:
// - Enables functional-style programming.
// - Simplifies operations on collections using methods like map(), filter(), reduce().
// - Supports lazy execution and parallel processing.
// Q45: What is the Optional class in Java?
// A45: The `Optional` class (introduced in Java 8) is used to represent optional values, avoiding null references and
// preventing NullPointerException.
// Q46: What are Method References in Java?
// A46: Method References provide a way to directly refer to existing methods by name using `::` syntax.
// Examples: `ClassName::staticMethod`, `object::instanceMethod`.
// Q47: How does Java achieve platform independence?
// A47: Java achieves platform independence through its `bytecode` format, which is executed by the JVM on any platform.
// Q48: What is Constructor Chaining?
// A48: Constructor Chaining refers to invoking one constructor from another (in the same or parent class) using
`this()` or
// `super()`.
// Q49: What are the main components of the Java Collections Framework?
// A49:
// - Interfaces: List, Set, Queue, Map, etc.
// - Implementations: ArrayList, LinkedList, HashMap, HashSet, TreeSet, etc.
// - Algorithms: Sorting, Searching, etc.
// Q50: What is a Comparator in Java?
// A50: A `Comparator` is an interface used to define a custom comparison logic for sorting objects.
// Q51: How does Autoboxing work in Java?
// A51: Autoboxing is the automatic conversion of primitive types to their corresponding wrapper class objects.
// Example: `int` to `Integer` or `double` to `Double`.
// Q52: What is the purpose of the java.util.concurrent package?
// A52: The `java.util.concurrent` package provides advanced concurrency utilities, like thread pools, locks, and
concurrent
// collections like ConcurrentHashMap, CopyOnWriteArrayList.
// Q53: What are the differences between a Stack and a Queue?
// A53:
// - Stack: Follows LIFO (Last In, First Out) order.
// - Queue: Follows FIFO (First In, First Out) order.
// Q54: What is the Fork/Join Framework?
// A54: The Fork/Join Framework is used for parallel processing tasks by recursively breaking them down into smaller
// sub-tasks and combining results.
// Q55: What is a BufferedReader in Java?
// A55: A `BufferedReader` is a class used to read text from input streams efficiently by buffering characters.
// Q56: What is the difference between the Path, Paths, and Files classes in Java?
// A56:
// - `Path`: Represents a file or directory path.
// - `Paths`: Contains static methods to obtain a `Path` instance.
// - `Files`: Provides methods for file and directory operations.
// Q57: What is the difference between Stream and Parallel Stream?
// A57:
// - Stream: Processes elements in a single thread.
// - Parallel Stream: Processes elements in multiple threads, achieving parallelism.
// Q58: What happens if the main() method is declared as private?
// A58: If `main()` is private, the program will compile but result in a runtime error since the JVM cannot access the
// `main()` method.
// Q59: What is a Singleton with thread safety?
// A59: A thread-safe Singleton ensures that only one instance is created across multiple threads. Example:
// `synchronized` keyword or using enums.
// Q60: What is a Callable in Java?
// A60: A `Callable` is similar to Runnable but returns a result and can throw exceptions. Example:
// `Future<Integer> future = executor.submit(new CallableTask());`
// This demonstrates the Callable interface. Below is a sample implementation:
import java.util.concurrent.Callable;

class CallableTask implements Callable<String> {
@Override
public String call() throws Exception {
// Simulate some computation or processing
Thread.sleep(1000);
return "Callable Task Completed!";
}
}

// Example usage in an executor service:
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {
public static void main(String[] args) {
ExecutorService executor = Executors.newSingleThreadExecutor();

        // Submit Callable task
        CallableTask task = new CallableTask();
        Future<String> result = executor.submit(task);

        try {
            // Get the result of the Callable task
            String output = result.get();
            System.out.println(output);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }

}
// Q61: What are the differences between "StringBuilder" and "StringBuffer" in Java?
// A61:
// - StringBuilder: Faster and not synchronized. Best used in single-threaded environments.
// - StringBuffer: Thread-safe and synchronized. Best used in multi-threaded environments.

// Q62: What is a memory leak in Java?
// A62: A memory leak occurs when allocated memory is not released, leading to resource exhaustion despite no longer being in use.

// Q63: What is Method Overriding in Java?
// A63: Method overriding occurs when a subclass provides a new implementation of a method inherited from a parent class, using the same signature.

// Q64: What is the use of the "transient" keyword in Java?
// A64: The `transient` keyword prevents serialization of specified fields, meaning they won't be saved during the serialization process.

// Q65: What is the difference between "checked" and "unchecked" exceptions?
// A65:
// - Checked exceptions: Checked at compile time and must be handled using `try-catch` or declared with `throws`.
// - Unchecked exceptions: Not checked at compile time, commonly subclasses of `RuntimeException`.

// Q66: What is the difference between an abstract class and an interface in Java?
// A66:
// - Abstract class: Can contain instance variables, constructors, and both abstract & concrete methods.
// - Interface: Can only declare constants and abstract methods (until Java 8 when default and static methods became supported).

// Q67: What is the use of the java.util.stream.Collectors class?
// A67: The `Collectors` class provides methods to convert streams into collections, strings, or other aggregated data structures like lists, maps, or sets.

// Q68: What is a functional interface, and how is it used in Java?
// A68: A functional interface contains exactly one abstract method. It can be implemented using lambda expressions. Example: `Predicate<T>` or `Function<T, R>`.

// Q69: What is the difference between Stack and Heap memory in Java?
// A69:
// - Stack: Used to store local variables and method call information. It's LIFO.
// - Heap: Used for dynamic memory allocation, including objects and class instances.

// Q70: What is Autoboxing and Unboxing in Java?
// A70: Autoboxing is the automatic conversion of primitive types into their corresponding wrapper classes (e.g., `int` → `Integer`). Unboxing is the reverse process (e.g., `Integer` → `int`).

// Q71: What is the significance of the "synchronized" keyword in Java?
// A71: The `synchronized` keyword provides a way to achieve thread safety by allowing only one thread at a time to execute critical sections.

// Q72: What is recursion in Java?
// A72: Recursion is the process where a method calls itself to solve smaller subproblems. A base condition is required to terminate it and prevent infinite recursion.

// Q73: What are Java annotations, and what are they used for?
// A73: Annotations provide metadata about program elements, used for code analysis and processing. Example: `@Override`, `@Deprecated`, `@FunctionalInterface`.

// Q74: What is Aggregation in Java?
// A74: Aggregation is a type of association where one object contains a reference to another but can exist independently. Example: `class School` containing `class Student`.

// Q75: What is "composition" in object-oriented programming?
// A75: Composition is a strong association where one object being composed (inner class) cannot exist without the containing object.

// Q76: What is Java's try-with-resources feature?
// A76: Introduced in Java 7, try-with-resources automatically closes resources (like `BufferedReader`, `FileWriter`) when exiting the block to avoid resource leaks.

// Q77: What is the difference between an Iterator and a ListIterator in Java?
// A77:
// - Iterator: Traverses elements in one direction and operates on any collection.
// - ListIterator: Traverses in both directions but only works on lists and allows modification of elements.

// Q78: What is the difference between "Serial" and "Parallel" Garbage Collection in Java?
// A78:
// - Serial GC: Single-threaded, best for small applications.
// - Parallel GC: Multi-threaded, improves throughput in large applications.

// Q79: What are the differences between POST and GET

// Q79: What are the differences between POST and GET in HTTP?
// A79:
// - GET: Sends data in the URL and is used to retrieve resources.
// - POST: Sends data in the body and is used to submit data or perform actions on the server.
// Q80: What is the purpose of the "volatile" keyword in Java?
// A80: The `volatile` keyword ensures visibility of changes to variables across threads by preventing threads from
caching their values.
// Q81: What is the purpose of the "final" keyword in Java?
// A81: The `final` keyword is used to declare constants, prevent method overriding, or inheritance of a class.
// Q82: What is the java.nio package used for?
// A82: The `java.nio` package provides non-blocking IO operations and efficient data handling using buffers and
channels.
// Q83: What is reflection in Java?
// A83: Reflection is a feature by which a program can inspect or modify its own structure or behavior at runtime using
the `java.lang.reflect` package.
// Q84: What is the difference between shallow copy and deep copy in Java?
// A84:
// - Shallow copy: Copies the object but not the referenced objects inside it.
// - Deep copy: Copies the object and all referenced objects recursively.
// Q85: What is the purpose of the hashCode() and equals() methods in Java?
// A85: These methods are used to compare objects for equality and to maintain the uniqueness of an object in
collections like `HashMap`, `HashSet`, etc.
// Q86: What is the difference between "throw" and "throws" in Java?
// A86:
// - `throw`: Used to explicitly throw an exception.
// - `throws`: Declares the exceptions a method can throw.
// Q87: What is dynamic method dispatch in Java?
// A87: Dynamic method dispatch is the process of resolving method calls at runtime based on the object's runtime type (
polymorphism).
// Q88: What is the difference between "this" and "super" in Java?
// A88:
// - `this`: Refers to the current instance of the class.
// - `super`: Refers to the parent class or its members.
// Q89: What are Java generics?
// A89: Generics enable type safety by allowing classes and methods to operate on parameterized types. Example:
`List<String>`.
// Q90: What is the difference between method overloading and method overriding in Java?
// A90:
// - Method Overloading: Same method name but different parameter lists in the same class.
// - Method Overriding: A subclass provides a new implementation for a method of the parent class.
// Q91: What is the difference between abstract class and concrete class?
// A91:
// - Abstract Class: Cannot be instantiated and may contain both abstract and concrete methods.
// - Concrete Class: Can be instantiated and contains only concrete methods.
// Q92: What is the use of "default" methods in interfaces?
// A92: Default methods allow interfaces to have method implementations, introduced in Java 8.
// Q93: What is the difference between an Exception and an Error in Java?
// A93:
// - Exception: Recoverable issue. Example: `IOException`, `SQLException`.
// - Error: Irrecoverable issue. Example: `OutOfMemoryError`, `StackOverflowError`.
// Q94: What are try, catch, and finally blocks in Java?
// A94: These are used for exception handling:
// - `try`: Holds the code that might throw exceptions.
// - `catch`: Handles the exceptions thrown in the `try` block.
// - `finally`: Always executes after `try` and `catch` blocks.
// Q95: What is the purpose of the "super()" call in a constructor?
// A95: The `super()` call is used to call the parent class's constructor in a subclass.
// Q96: What is the diamond problem in Java, and how is it resolved?
// A96: The diamond problem arises in multiple inheritance. Java resolves it by allowing interfaces with default methods
but disallowing multiple inheritance with classes.
// Q97: What is the difference between compile-time and runtime polymorphism in Java?
// A97:
// - Compile-time Polymorphism: Achieved through method overloading.
// - Runtime Polymorphism: Achieved through method overriding.
// Q98: What is an Enum in Java?
// A98: An Enum is a special data type that defines a fixed set of constants. Example: `enum Day { SUNDAY, MONDAY }`.
// Q99: What is the purpose of the Optional class in Java 8?
// A99: The `Optional` class is used to avoid null checks and represent optional values. Example:
`Optional.ofNullable(value)`.
// Q100: What is the difference between a process and a thread in Java?
// A100:
// - Process: Represents a running program with its own memory space.
// - Thread: A lightweight process that shares the memory of its parent process.