class Cylinder{
     private float radius;
     private float height;

     public Cylinder(){
        radius=height=1;
     }
     public Cylinder(float r,float h){
        radius=r;
        height=h;
     }
     public void setRadius(float r){
        radius=r;
     }
     public void setHeight(float h){
        height=h;
     }
     public void setDimensions(float r,float h){
        radius=r;
        height=h;
     }

     public float lidArea(){
        return (float)Math.PI*radius*radius;
     }
     public float perimeter(){
        return 2*(float)Math.PI*radius;
     }
     public float volume(){
        return 2*lidArea()+perimeter()*height;
     }
}
public class CylinderTest {
    public static void main(String[] args) {
        Cylinder c=new Cylinder(3.5f,6.8f);
        System.out.println("lidArea: "+c.lidArea());
        System.out.println("perimeter: "+ c.perimeter());
        System.out.println("Volume: "+c.volume());      
    }
}
