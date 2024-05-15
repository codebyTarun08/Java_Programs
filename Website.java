import java.util.Scanner;

public class Website {
       public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the Url:");
         String url=sc.nextLine();

         String protocol=url.substring(0,url.indexOf(":"));
         if(protocol.equals("https")){
            System.out.println("Hyper text transfer protocol");
         }
         else if(protocol.equals("ftp")){
            System.out.println("File Transfer Protocol");
         }
         else{
            System.out.println("Invalid protocol");
         }

         String extension=url.substring(url.lastIndexOf(".")+1);

         if(extension.equals("com")){
            System.out.println("commercial");
         }
         else if(extension.equals("net")){
            System.out.println("network");
         }
         else if(extension.equals("org")){
            System.out.println("organization");
         }
         else{
            System.out.println("Unknown extension");
         }
     }
         
}
