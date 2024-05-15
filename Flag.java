public class Flag{
    public static void main(String[] args) {
        int x=10;
        int y=-5;
        float f=125.97f;
        String str="Java";
        System.out.printf("%5d\n",x); // 10 is printed in 5 places
        System.out.printf("%05d\n",x); //10 is printed in 5 places and void places are filled with 0's.
        System.out.printf("%+5d\n",x); //if integer no. is +ve then it print +no. and if -ve then print -no.
        System.out.printf("%+5d\n",y); //it print -no. because y is -ve.
        System.out.printf("%(5d\n",y); //the number is enclosed with brackets.
        System.out.printf("%f\n",f); //float number are not exactly print it will print pricise value. 
        System.out.printf("%5f\n",f); //Float number will print normally
        System.out.printf("%5.2f\n",f); //Float number will print in 5 places if it equal or less than 5 else it will print the whole number.and 2 places after the decimal poiint.
        System.out.printf("%10.2f\n",f); //Float number will print in 10 places and 2 places after the decimal point and remaining places are void.
        System.out.printf("%010.2f\n",f);//remaining places are filled with 0's.
        System.out.printf("%s\n",str); //it will print normally string
        System.out.printf("%20s\n",str); //it will print the string in 20 places and it will be right align.
        System.out.printf("%-20s\n",str);// it will be left align because -ve is use.
    }
}