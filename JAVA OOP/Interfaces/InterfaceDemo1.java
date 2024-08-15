interface Test1{
    public void meth1();
    public void meth2();
}
class Test2 implements Test1{
    public void meth1(){
        System.out.println("Meth1 of Test2");
    }
    public void meth2(){
        System.out.println("Meth2 of Test2");
    }
    public void meth3(){
        System.out.println("Meth3 of Test3");
    }
}
public class InterfaceDemo1 {
    public static void main(String[] args) {
        Test1 t1=new Test2();
        t1.meth1();
        t1.meth2();
        Test2 t2=new Test2();
        t2.meth3();
    }
}
