import java.util.Scanner;
class Index {
    public void getIndex()
    {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print("("+i+","+j+")");
            }
            System.out.println("");
        }
    }
}
/*O/p: 
(1,1)(1,2)(1,3)(1,4)(1,5)
(2,1)(2,2)(2,3)(2,4)(2,5)
(3,1)(3,2)(3,3)(3,4)(3,5)
(4,1)(4,2)(4,3)(4,4)(4,5)
(5,1)(5,2)(5,3)(5,4)(5,5) */

class Pattern1{
    public void getPattern1(){
       for(int i=1;i<=5;i++){
        for(int j=1;j<=5;j++){
            System.out.print(j+" ");
        }
        System.out.println("");
       }
    }
}
/*O/P: 
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5
*/

class Pattern2{
    public void getPattern2(){
       for(int i=1;i<=5;i++){
        for(int j=1;j<=5;j++){
            System.out.print(i+" ");
        }
        System.out.println("");
       }
    }
}

/*O/P: 
1 1 1 1 1 
2 2 2 2 2 
3 3 3 3 3 
4 4 4 4 4 
5 5 5 5 5
*/

class Pattern3{
    public void getPattern3(){
       for(int i=1;i<=5;i++){
        for(int j=1;j<=5;j++){
            System.out.print((i+j)+" ");
        }
        System.out.println("");
       }
    }
}

/*O/P: 
2 3 4 5 6 
3 4 5 6 7 
4 5 6 7 8 
5 6 7 8 9
6 7 8 9 10
*/

class Pattern4{
    public void getPattern4(){
        int c=0;
       for(int i=1;i<=5;i++){
        for(int j=1;j<=5;j++){
            c++;
            System.out.format("%02d ",c);
        }
        System.out.println("");
       }
    }
}

/*O/P: 
01 02 03 04 05 
06 07 08 09 10 
11 12 13 14 15 
16 17 18 19 20
21 22 23 24 25
*/

class Pattern5{
    public void getPattern5(){
       for(int i=1;i<=5;i++){
        for(int j=1;j<=i;j++){
            System.out.format("%2d ",j);
        }
        System.out.println("");
       }
    }
}
/*O/P: 
 1 
 1  2 
 1  2  3 
 1  2  3  4
 1  2  3  4  5 
*/
class Pattern6{
    public void getPattern6(){
        int c=0;
       for(int i=1;i<=5;i++){
        for(int j=1;j<=i;j++){
            c++;
            System.out.format("%02d ",c);
        }
        System.out.println("");
       }
    }
}
/*O/P:
01 
02 03 
04 05 06 
07 08 09 10
11 12 13 14 15
*/
class Pattern7{
    public void getPattern7(){
       for(int i=1;i<=5;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println("");
       }
    }
}
/*O/P:
*
**
***
****
*****
*/

class Pattern8{
    public void getPattern8(){
        // int c=5;
       for(int i=1;i<=5;i++){
        for(int j=1;j<=5-i+1;j++){         //for(int j=1;j<=c;j++)
            System.out.print(j+" ");       //System.out.print(*+" ");
        }
        // c--;
        System.out.println("");
       }
    }
}
/*O/P:
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
*/
class Pattern9{
    public void getPattern9(){
        int c=0;
       for(int i=1;i<=5;i++){
        for(int j=1;j<=5-i+1;j++){
            c++;
            System.out.format("%02d ",c);
        }
        System.out.println("");
       }
    }
}
/*O/P:
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
*/
class Pattern10{
    public void getPattern10(){
       for(int i=1;i<=5;i++){
        for(int j=1;j<=5;j++){
           if(i<=j){
            System.out.print("* ");
           }
           else{
            System.out.print("  ");
           }
        }
        System.out.println("");
       }
    }
}
/*O/P:
* * * * * 
  * * * * 
    * * * 
      * * 
        *
*/

class Pattern11{
    public void getPattern11(){
       for(int i=1;i<=5;i++){
        for(int j=1;j<=5;j++){
           if(j>=5-i+1){                 //if(i+j>5)
            System.out.print("* ");
           }
           else{
            System.out.print("  ");
           }
        }
        System.out.println("");
       }
    }
}
/*O/P:
        * 
      * * 
    * * * 
  * * * * 
* * * * *
*/
class Pattern12{
    public void getPattern12(){
       for(int i=1;i<=5;i++){

        for(int j=1;j<=5;j++){
          if(i+j>5){
            System.out.print("*");
          }
          else{
            System.out.print(" ");
          }
        }
        for(int k=6;k<=9;k++){
          if(k<i+5){
            System.out.print("*");
          }
          else{
            System.out.print(" ");
          }
        }
        System.out.println("");
       }
    }
}
/*O/P:
    *    
   ***   
  *****  
 ******* 
*********
*/
class Pattern13{
    public void getPattern13(){
       for(int i=1;i<=5;i++){

        for(int j=1;j<=5;j++){
          if(i+j>5){
            System.out.print("*");
          }
          else{
            System.out.print(" ");
          }
        }
        for(int k=6;k<=9;k++){
          if(k<i+5){
            System.out.print("*");
          }
          else{
            System.out.print(" ");
          }
        }
        System.out.println("");
       }
    }
}
/*O/P:
    *    
   ***   
  *****  
 ******* 
*********
*/

public class Matrix{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Option");
        System.out.println("1.Index");
        System.out.println("2.Pattern1");
        System.out.println("3.Pattern2");
        System.out.println("4.Pattern3");
        System.out.println("5.Pattern4");
        System.out.println("6.Pattern5");
        System.out.println("7.Pattern6");
        System.out.println("8.Pattern7");
        System.out.println("9.Pattern8");
        System.out.println("10.Pattern9");
        System.out.println("11.Pattern10");
        System.out.println("12.Pattern11");
        System.out.println("13.Pattern12");
        int option=scan.nextInt();
        switch(option){
            case 1:
               Index i=new Index();
               i.getIndex();
               break;
            case 2:
               Pattern1 p=new Pattern1();
               p.getPattern1();
               break;
            case 3:
               Pattern2 p1=new Pattern2();
               p1.getPattern2();
               break;
            case 4:
               Pattern3 p2=new Pattern3();
               p2.getPattern3();
               break;
            case 5:
               Pattern4 p3=new Pattern4();
               p3.getPattern4();
               break;          
            case 6:
               Pattern5 p4=new Pattern5();
               p4.getPattern5();
               break;          
            case 7:
               Pattern6 p5=new Pattern6();
               p5.getPattern6();
               break;          
            case 8:
               Pattern7 p6=new Pattern7();
               p6.getPattern7();
               break;                   
            case 9:
               Pattern8 p7=new Pattern8();
               p7.getPattern8();
               break;                   
            case 10:
               Pattern9 p8=new Pattern9();
               p8.getPattern9();
               break;                   
            case 11:
               Pattern10 p9=new Pattern10();
               p9.getPattern10();
               break;                   
            case 12:
               Pattern11 p10=new Pattern11();
               p10.getPattern11();
               break;                   
            case 13:
               Pattern12 p11=new Pattern12();
               p11.getPattern12();
               break;                   
            case 14:
               Pattern13 p12=new Pattern13();
               p12.getPattern13();
               break;                   
        }
    }
}