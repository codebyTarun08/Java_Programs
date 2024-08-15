import java.io.ByteArrayInputStream;

public class ByteDemo {
    public static void main(String[] args) throws Exception{
        byte[] b={'a','b','c','d','e','f','g','h'};

        ByteArrayInputStream bis=new ByteArrayInputStream(b);
        int x;
        while((x=bis.read())!=-1){
            System.out.print((char)x + " :");//It will print the alphabet characters.
            System.out.print(x + " "); //It will print the ASCII CODE of Alphabet characters.           
        }
        bis.close();
    }
}
