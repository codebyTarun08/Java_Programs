
public class Array {

    public static void main(String[] args) {

        //First type of declaration of array.
        int A[] = new int[10];

        //Second type:In this Type insted of passing size The elements are giving so size is set at compile time
        int B[] = { 1, 2, 3, 4, 5 };



        /* In third type first array reference is declared and after that the size is declared.
         * int C[];
         * C=new int[10];
         * 
         * B[2]=15;
         */

        /*
         * for(int i=0;i<A.length;i++)
         * {
         * System.out.println(A[i]);
         * }
         */

        /*
         * for(int i=0;i<B.length;i++)
         * {
         * System.out.println(B[i]);
         * }
         */

        
          for(int x:B)
         {
          System.out.println(x++);
          }
          for(int x:B)
          {
          System.out.println(x);
          }
         

        /*
         * for(int i=0;i<B.length;i++)
         * {
         * System.out.println(B[i]++);
         * }
         */

        System.out.println(B.length);
    }

}
