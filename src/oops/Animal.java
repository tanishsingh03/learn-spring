package oops;

abstract class Animal {
    abstract void  walk();
    Animal(){
        System.out.println("animal created");
    }
}
class Dog extends Animal{
    Dog(){
        System.out.println("dog is created");
    }
    void walk(){
        System.out.println("on 4 lengs");
    }

}
class chicken extends Animal{
    void walk(){
        System.out.println("on 2 lengs");
    }
}
