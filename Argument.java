public class Argument {
    public static void main(String[] args) {
        int x=10;
        float y=10.2f;
        char z='A';
        String str="Java";

        System.out.printf("%1$d %1$d %1$d \n",x);
        System.out.printf("%1$d %2$e %1$d \n", x,y);
        System.out.printf("%3$s %2$f %1$d \n",x,y,z);
    }
}
