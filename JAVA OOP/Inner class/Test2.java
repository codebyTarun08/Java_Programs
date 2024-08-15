class Outer
{
   public void display(){               //A class inside the Method is  called a Local Inner Class.
    class Inner{
        void innerDisplay(){
            System.out.println("Hello");
        }
    }
    Inner i=new Inner();
    i.innerDisplay();
   }
}
public class Test2 {
    public static void main(String[] args) {
        Outer o=new Outer();
        o.display();
    }
}
