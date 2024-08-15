//Anonymous Inner class
abstract class My{                   //interface My{ void display();}
    abstract void display();
}
class Outer{
    public void meth()
    {
       My m=new My(){            //the object of My class is not created but there is the class My is define by override the method display();
          void display(){
            System.out.println("Hi");
          }
       };
       m.display();
    }
}
public class Test3 {
    public static void main(String[] args) {
        Outer o=new Outer();
        o.meth();
    }
}
