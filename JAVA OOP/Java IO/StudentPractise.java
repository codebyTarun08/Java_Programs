//READ THE DATA WRITTEN IN CAPITALL FORM FROM source1.txt AND COPY IT TO source2.txt BUT IN SMALL LETTERS.
import java.io.FileInputStream;
import java.io.FileOutputStream;


//ASCII CODE FOR CAPITAL LETTER 67 TO 90
//ASCII CODE FOR SMALL LETTER 97 TO 122
public class StudentPractise {
    public static void main(String[] args) throws Exception{
        FileInputStream fis=new FileInputStream("D:/Programs/Java IO/source1.txt");
        FileOutputStream fos=new FileOutputStream("D:/Programs/Java IO/source2.txt");

        int b;
        while((b=fis.read())!=-1){
            if(b>=67 && b<=90){
                fos.write(b+32);
            }
            else{
                fos.write(b);
            }
        }
        fis.close();
        fos.close();
    }
}
