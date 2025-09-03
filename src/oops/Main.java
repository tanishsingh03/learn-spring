package oops;
//Why do we use package?
//        Organization – keeps related classes together (like files in folders).
//        Example:
//        package school; might contain Student.java, Teacher.java.
//        package office; might contain Employee.java, Manager.java.
//        Avoids name conflicts – two classes can have the same name if they are in different packages.
//        Example:
//        school.Student vs office.Student
//        Code Reuse – You can import and reuse classes from other packages (import java.util.Scanner;).
//Access Control – Packages help with visibility (public, protected, default access).

public class Main {
    public static void main(String[] args) {
//    Pen p1=new Pen();
//    p1.color="blue";
//    p1.type="ball";
//p1.write();
//p1.printColor();
//p1.printType();
//
//Student s1= new Student();
//Student s2=new Student("tanish",34);
//s2.printname();
//s2.printage();



 //getter and setter
//Accounts a1= new Accounts();
//a1.name="tanish";
//a1.email="abc@gmail.com";
//a1.setPassword("1234");
//        System.out.println(a1.getPassword());




        //abstraction
        Dog d1=new Dog();
        d1.walk();
        Animal a1= new chicken(); // polymorphisim
        a1.walk();



//        Animal a2= new Animal(); // we cannot do this because animal is an abstract class
        //this will give us runtime error
//        a2.walk();
    }
}




//1.What is new in Java?
//The new keyword is used to create objects in Java.
//When you use new, Java does 3 things:
//Allocates memory for the object on the heap.
//Calls the constructor of the class.
//Returns a reference to the newly created object.


//explained :-
//1.Memory Allocation (Heap)
//  Space is allocated in the heap memory for the object.
//  Heap is where all objects live until garbage collected.
// 2.Constructor Call
//   The Pen() constructor is executed (default one if you didn’t define any).
//   It initializes the object’s variables.
//3.Reference Return
//    The new operator returns the address (reference) of the object in memory.
//    That reference is stored in the variable p1 (which lives on the stack).








//🔹 What is Encapsulation?
    //Encapsulation is an OOP principle where you wrap data (fields/variables) and behavior (methods) inside a single unit (class).
    //It also means hiding sensitive data from direct access and only exposing it in a controlled way.
    //👉 Think of it as putting variables in a box and only allowing controlled access through doors (methods).
//🔹 Key Features
    //Data Hiding → fields are usually marked private.
    //Controlled Access → exposed through public methods (getters/setters).
    //Improved Security → prevents unwanted/invalid changes.
    //Flexibility → implementation can change, interface remains same.
    //Better Maintainability → one place to manage data and rules.
//🔹 How to Achieve Encapsulation?
    //Make class variables private.
    //Provide public getter and setter methods.
    //Optionally, add validation or custom logic inside setters.