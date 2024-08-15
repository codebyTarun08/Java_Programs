
interface Test{
    void meth1();
    void meth2();
}
class Test2 implements Test{
    public void meth1(){
        System.out.println("Meth1 ");
    }
    public void meth2(){
        System.out.println("Meth2 ");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        Test t=new Test2();
        t.meth1();
        t.meth2();
    }
}
// "cd $dir && javac $fileName && java $fileNameWithoutExt"