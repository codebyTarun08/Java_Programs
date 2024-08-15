class Parent{
    void display(){
       System.out.println("Parent class");
    }
}
class Child extends Parent{
    void display(){
        System.out.println("Child class");
    }
}
public class Over{
    public static void main(String[] args) {
        Child c=new Child();
        c.display();                  //child Class

        Parent p1=new Parent();
        p1.display();                  //Parent Class

        Parent p=new Child();           //Dynamic Method Dispatch:- Parent class reference holding the object of child class
        p.display();                  //Child class
    }
}
