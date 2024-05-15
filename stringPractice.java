public class stringPractice{
    public static void main(String args[])
    {
        String str=new String("Java program");
        int len=str.length();
        System.out.println(len);//the len method will give length of string and it will also cound blank space.

        String str2=str.toUpperCase();//this method will create new string and str2 will be pointing to that new object
                                      // and the passing string is created in pool but resulting string is in heap memory. 
        System.out.println(str2);

        String str3=new String("    java     ");
        String str4=str3.trim();//trim method will remove leading and trailing blank spaces and resulting string in heap.
        System.out.println(str4);

        String str5=str.substring(2, 7);//this method gives string start from 2 to 6th index.
        System.out.println(str5);

        String str6=str.replace('a','A');//this method will replace the old char to new char and return type is string.
        System.out.println(str6);

        System.out.println(str.startsWith("Ja"));//it checks and return the voolean value.
        System.out.println(str.endsWith("course"));//it checks and return the voolean value.

        System.out.println(str.charAt(5));//this method will return the char presenting at index.
        System.out.println(str.charAt(4));//this method will return the char presenting at index.

        System.out.println(str.indexOf("p"));//this method will return index of character presenting in string.
        System.out.println(str.indexOf("a", 2));

        System.out.println(str.lastIndexOf("p"));//this method will return the index from last character.

        boolean b=str.equals(str6);//this method check both strings or objects are equal or not.
        System.out.println(b);
        System.out.println(str.equalsIgnoreCase(str6));
        System.out.println(str.compareTo(str3));

    }
}
