//1) Nested Inner class
class Outer{
    int x=18;
    class Inner{
        int y=20;
        void display(){
            System.out.println("Inner class display");
            System.out.println(x);
            System.out.println(y);
        }
    }
    void display(){
      Inner i=new Inner();     
      i.display();
      System.out.println("y: "+ i.y); //Accessing inner class Member using object of Inner class.
    }
}

public class Test1 {
    public static void main(String[] args) {
        Outer o=new Outer();
        o.display();
        Outer.Inner oi=new Outer().new Inner();     //creating inner class object in another class outside the outer class
        oi.display();
    }
}
