//4)Static inner class
class Outer{
    static int x=12;
    public static Object Inn;
    int y=43;
   static class Inner{
        public void display(){
            System.out.println(x);
         //   System.out.println(y); Non startic member cannot be accessed by static class.
        }
    }
}
public class Test4 {
    public static void main(String[] args) {
        Outer.Inner i=new Outer.Inner();
        i.display();
        Outer o=new Outer();
        System.out.println(o.y);
        System.out.println(Outer.x);
    }
}
