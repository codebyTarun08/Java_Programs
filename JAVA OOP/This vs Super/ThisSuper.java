class Rectangle{
    int length;
    int breadth;
    int x=10;

    Rectangle(int l,int b){
        length=l;
        breadth=b;
    }
    int area(){
        return length*breadth;
    }
}
class Cuboid extends Rectangle{
    int height;
    int x=20;
    Cuboid(int l,int b,int h){
        super(l,b);
        height=h;
    }
    int volume(){
        return area()*height;
    }
    void display(){
        System.out.println(super.x);
        System.out.println(this.x);
    }
}
public class ThisSuper {
   public static void main(String[] args) {
    Cuboid c=new Cuboid(5,3,10);
    System.out.println("Area: "+ c.area());
    System.out.println("Volume: "+ c.volume());
    c.display();
   }   
}