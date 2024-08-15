import java.io.FileOutputStream;

// Method 1
// public class FileOutputExample {
//     public static void main(String[] args) throws Exception {
//         FileOutputStream fos=new FileOutputStream("D:/Programs/Java IO/text.txt");
//         String str="Learn Java Programming";
//         fos.write(str.getBytes());
//         fos.close();
//     }    
// }
//Method 2
// public class FileOutputExample {
//     public static void main(String[] args) throws Exception {
//         FileOutputStream fos=new FileOutputStream("D:/Programs/Java IO/text.txt");
//         String str="Learn Java Programming";
//         byte[] b=str.getBytes();
//         for(int x:b){
//             fos.write(x);
//         }       
//         fos.close();
//     }    
// }

//Method 3
public class FileOutputExample {
    public static void main(String[] args){
        try{
        FileOutputStream fos=new FileOutputStream("D:/Programs/Java IO/testmethod3.txt");
        String str="Learn Java Programming";
        byte[] b=str.getBytes();
        
            fos.write(b, 6, str.length()-6);

            fos.close();
        }
        catch(Exception e){
            System.out.println(e);
        }                
    }    
}
