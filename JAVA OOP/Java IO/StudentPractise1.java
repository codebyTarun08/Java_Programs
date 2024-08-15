//READ THE DATA FROM SOURCE1.TXT AND SOURCE2.TXT AND WRITE IT TO THE DESTINATION.TXT

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;
//WE CAN USE SEQUENCEINTPUTSTREAM WHICH WRITE FIRS FIS1 AND THEN FIS2

public class StudentPractise1 {
    public static void main(String[] args) throws Exception{
        FileInputStream fis1=new FileInputStream("D:/Programs/Java IO/source1.txt");
        FileInputStream fis2=new FileInputStream("D:/Programs/Java IO/source2.txt");
        FileOutputStream fos=new FileOutputStream("D:/Programs/Java IO/Destination.txt");

        SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
        int b;
        while((b=sis.read())!=-1){
            fos.write(b);
        }

        sis.close();
        fis1.close();
        fis2.close();
        fos.close();
    }
}
