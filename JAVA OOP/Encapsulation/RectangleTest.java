class Rectangle{
    private double length;
    private double breadth;

    public double getLength(){
        return length;
    }
    public double getBreadth(){
        return breadth;
    }
    public void setLength(double l){
        length=l;
    }
    public void setBreadth(double b){
        breadth=b;
    }
    public double area(){
        return length*breadth;
    }
    public double perimeter(){
        return 2*(length+breadth);
    }
    public boolean isSquare(){
        return length==breadth;
    }
}
class RectangleTest{
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.setLength(11.0);
        r.setBreadth(12.0);
        System.out.println("Area: "+r.area());
        System.out.println("Circumference: "+r.perimeter());
        System.out.println("It is Square: "+r.isSquare());
    }
}