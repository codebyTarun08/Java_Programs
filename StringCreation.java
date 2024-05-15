public class StringCreation {
       public static void main(String[] args) {
         String str1="Java Program";
         System.out.println(str1);
         String str2=new String("java");
         System.out.println(str2);

         char c[]={'H','E','L','L','O'};
         String str3=new String(c);
         System.out.println(str3);

         byte b[]={64,65,66,67,68};
         String str4=new String(b);
         System.out.println(str4);

         /**Slicing of strings
         To check strings methods write the command in cmd  javap java.lang.String  */

         String str5=new String(c,1,3);
         System.out.println(str5);
         String str6=new String(b,2,2);
         System.out.println(str6);

         /* To check the two or more references are pointing to one object or not */
         String str7="Same object";
         String str8="Same object";
         System.out.println(str7==str8);//Gives boolean value
         //str is the reference so it hold the address of object and comparison of addresses are done.
         String str9="same object";
         System.out.println(str7==str9);//Java is case sensitive
       }
}
