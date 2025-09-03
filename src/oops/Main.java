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
    Pen p1=new Pen();
    p1.color="blue";
    p1.type="ball";
p1.write();
p1.printColor();
p1.printType();

Student s1= new Student();
Student s2=new Student("tanish",34);
s2.printname();
s2.printage();
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