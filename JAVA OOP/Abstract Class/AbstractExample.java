
abstract class Super{       //To declare class Abstract "abstract" keyword is used.
    public Super(){
        System.out.println("Super Constructor");
    }
    public void meth1(){
        System.out.println("Method of super");
    }
    abstract public void meth2();       //This method is known as abstract method.
    //To declare a class abstract we should make a bodyless method and declare it as abstract and then class will abstract and class should be declared as abstract.
}                                 //The class are of 2 types (i)Abstract & (ii)Concrete

class Sub extends Super{           //The Sub class will be abstract if we did not override and complete the body of method meth2. Now Sub class becomes Concrete.
    @Override
    public void meth2(){
        System.out.println("Method of Sub");
    }
}
//The object of abstract class cannot be created but the reference of that class can be made.
//The inheriting sub class will also become abstract.To create the object of sub class or make class concrete , we should override all abstract method of Super class.
public class AbstractExample{
    public static void main(String[] args) {
        Super s=new Sub();
        s.meth1();
        s.meth2();
        }
}

//Abstract class also use as interface.