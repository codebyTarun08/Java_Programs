// package Multithreading;
// class PriorityDemo extends Thread{
//     public void run(){
//         System.out.println("Inside run method");
//     }
//     public static void main(String[] args) {
//       PriorityDemo t1=new PriorityDemo();  
//       PriorityDemo t2=new PriorityDemo();  
//       PriorityDemo t3=new PriorityDemo();  

//       System.out.println("Before After Setting priority of Threads.");
//       System.out.println("t1 thread Priority: "+ t1.getPriority());
//       System.out.println("t2 thread Priority: "+ t2.getPriority());
//       System.out.println("t3 thread Priority: "+ t3.getPriority());

//       t1.setPriority(2);
//       t2.setPriority(5);
//       t3.setPriority(10);

//       System.out.println("After Setting priority of Threads.");
//       System.out.println("t1 thread Priority: "+ t1.getPriority());
//       System.out.println("t2 thread Priority: "+ t2.getPriority());
//       System.out.println("t3 thread Priority: "+ t3.getPriority());

//       System.out.println("Currently executing thread: "+ Thread.currentThread().getName());
//       System.out.println("Current thread priority: "+ Thread.currentThread().getPriority());
//       Thread.currentThread().setPriority(MAX_PRIORITY);
//       System.out.println("After setting Current thread priority: "+ Thread.currentThread().getPriority());  
//     }   
// }

class MyThread extends Thread {
  public MyThread(String name) {
      super(name);
  }

  @Override
  public void run() {
      for (int i = 1; i <= 5; i++) {
          System.out.println(getName() + ": " + i);
      }
  }
}

public class ThreadPriorityDemo {
  public static void main(String[] args) {
      MyThread thread1 = new MyThread("Thread 1");
      MyThread thread2 = new MyThread("Thread 2");
      MyThread thread3 = new MyThread("Thread 3");

      // Set thread priorities
      thread1.setPriority(Thread.MIN_PRIORITY); // Priority 1
      thread2.setPriority(Thread.NORM_PRIORITY); // Priority 5 (default)
      thread3.setPriority(Thread.MAX_PRIORITY); // Priority 10

      // Start the threads
      thread1.start();
      thread2.start();
      thread3.start();
  }
}
