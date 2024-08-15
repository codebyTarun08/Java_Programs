import java.io.FileInputStream;
import java.io.FileReader;

//Method 1
// public class FileInputExample{
//    public static void main(String[] args) throws Exception{
//         FileInputStream fis=new FileInputStream("D:/Programs/Java IO/text.txt");
//         byte[] b=new byte[fis.available()];
//         fis.read(b);
//         String str=new String(b);
//         System.out.println(str);
//         fis.close();
//    }
// }

//Method 2
// public class FileInputExample{
//    public static void main(String[] args) throws Exception{
//         FileInputStream fis=new FileInputStream("D:/Programs/Java IO/text.txt");
//         int x;
//         do{
//             x=fis.read();
//             if(x!=-1){
//                 System.out.print((char)x);
//             }         
//         }while(x!=-1);
//         fis.close();
//    }
// }

//Method 3
public class FileInputExample{
   public static void main(String[] args) throws Exception{
        FileInputStream fis=new FileInputStream("D:/Programs/Java IO/text.txt");
        int x;
        while((x=fis.read())!=-1){
           System.out.print((char)x);       
        }
        fis.close();
   }
}


// FileReader class is same sa FileInputStream class.
//Only difference in type byte and char.
// public class FileInputExample{
//    public static void main(String[] args) throws Exception{
//         FileReader fr=new FileReader("D:/Programs/Java IO/text.txt");
//         int x;
//         while((x=fr.read())!=-1){
//            System.out.print((char)x);       
//         }
//         fr.close();
//    }
// }