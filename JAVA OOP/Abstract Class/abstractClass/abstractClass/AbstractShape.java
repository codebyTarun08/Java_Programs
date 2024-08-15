
abstract class Shape{
    abstract public double area();
    abstract public double perimeter();
}
class Circle extends Shape{
    public double radius;
    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
}
class Rectangle extends Shape{
    public double length;
    public double breadth;
    public double area(){
        return length*breadth;
    }
    public double perimeter(){
        return 2*(length+breadth);
    }
}
public class AbstractShape {
    public static void main(String[] args) {
        Circle c=new Circle();
        Shape s=c;
        c.radius=3.9;
        System.out.println("From s reference Area: "+ s.area());
        System.out.println("From c reference Area: "+ c.area());

        Rectangle r=new Rectangle();
        r.length=12.4;
        String bre="6.8";
        try{
            r.breadth=Double.parseDouble(bre);
        } catch (NumberFormatException e){
            System.out.println("Invalid Input");
        }
        Shape s1=r;
        System.out.println("From s1 reference Area: "+ s1.area());
        System.out.println("From r reference perimeter: "+ r.perimeter());

    }
}
