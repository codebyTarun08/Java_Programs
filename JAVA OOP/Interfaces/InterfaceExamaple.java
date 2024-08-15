class Phone{
    public void call(){
        System.out.println("Phone is making a call");
    }
    public void sms(){
        System.out.println("Phone sending sms");
    }
}
interface ICamera{
    void click();
    void record();
}
interface IMusicplayer{
    void play();
    void stop();
}
class Smartphone extends Phone implements ICamera,IMusicplayer{
    public void videoCall(){
        System.out.println("Smartphone is making videocall");
    }
    public void click(){
        System.out.println("Smartphone is clicking photos");
    }
    public void record(){
        System.out.println("Smartphone is recording videos");
    }
    public void play(){
        System.out.println("Smartphone is playing Music");
    }
    public void stop(){
        System.out.println("Smartphone stopped Music");
    }
}
public class InterfaceExamaple {
    public static void main(String[] args) {
        Smartphone sp=new Smartphone();
        Phone p=sp;
        ICamera c=sp;
        IMusicplayer m=sp;
        System.out.println("***Using individual reference***");
        p.call();
        p.sms();
        c.click();
        c.record();
        m.play();
        m.stop();
        System.out.println("***Using Smartphone class reference***");
        sp.call();
        sp.sms();
        sp.click();
        sp.record();
        sp.play();
        sp.stop();
    }
}