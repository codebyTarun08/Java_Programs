class Car{
    public void start(){
        System.out.println("car is started.");
    }
    public void accelerate(){
        System.out.println("car is acceleerated.");
    }
    public void changeGear(){
        System.out.println("The gear is changed.");
    }
}
class LuxuryCar extends Car{
    @Override
    public void changeGear(){
        System.out.println("Automatic gears");
    }
    public void openRoof(){
        System.out.println("Roof of Luxurycar is opened.");
    }
}
public class Over_Example2 {
    public static void main(String[] args) {
        Car c=new LuxuryCar();
        c.start();
        c.accelerate();
        c.changeGear();//It gives the statement of overrided method.Even with the reference of Car class.

        LuxuryCar c1=new LuxuryCar();
        c1.openRoof();   //we can't use old cafr reference because the functionality to open roof is not available in Car class.
    }
}
