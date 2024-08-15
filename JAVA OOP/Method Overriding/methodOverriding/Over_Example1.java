class TV{
    public void switchON(){
        System.out.println("TV is Switched On");
    }
    public void changeChannel(){
        System.out.println("Tv Channel is Changed");
    }
}
class SmartTV extends TV{
    @Override
    public void switchON(){
        System.out.println("Smart Tv is Switched On");
    }
    @Override
    public void changeChannel(){
        System.out.println("Smart Tv channel is changed");
    }
    public void browse(){
        System.out.println(" Smart TV is Browsing");
    }
}
public class Over_Example1 {
    public static void main(String[] args) {
        TV t=new SmartTV();
        t.switchON();
        t.changeChannel();
        // t.browse();  TV type reference will allow only those methods to execute which are present or created in TV class.
                        //Execution of methods is based on Object class not on referencce class.
    }
}