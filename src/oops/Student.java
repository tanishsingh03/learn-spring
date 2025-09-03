package oops;
class Student {
    String name;
    int age;

    Student(){
        System.out.println("contructor called Student");
    }
    Student(String k,int a){
        this.name=k;
        this.age=a;
    }
    public void printname(){
        System.out.println(name);
    }
    public void printage(){
        System.out.println(age);
    }

}