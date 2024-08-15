// package Multithreading;

//1)By extending Thread class
// class MultiGFGDemo extends Thread{
//       public void run(){
//         try{
//             System.out.println("Thread "+Thread.currentThread().threadId()+"is running");//getId() is not allow since java 19
//         }
//         catch (Exception a){
//             System.out.println("Exception is caught");
//         }
//       }
    
// }
// public class MultiGFG {
//     public static void main(String[] args) {
//         int n=8;
//         for(int i=0;i<n;i++){
//             MultiGFGDemo m=new MultiGFGDemo();
//             m.start();
//         }
//     }
// }

//2)bY implementing Runnable interface
class MultiGFGDemo implements Runnable{
    public void run(){
      try{
          System.out.println("Thread "+Thread.currentThread().threadId()+" is running");//getId() is not allow since java 19
      }
      catch (Exception a){
          System.out.println("Exception is caught");
      }
    }
}
public class MultiGFG {
    public static void main(String[] args) {
        int n=8;
        for(int i=0;i<n;i++){
            MultiGFGDemo m=new MultiGFGDemo();  //Thread t=new Thread(new MultiGFGDemo);
            Thread t=new Thread(m);
            t.start();
        }
    }
}