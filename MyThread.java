class MyThread1 extends Thread{
    public void run()
    {
       try{
       for(int i=1;i<=5;i++)
       {
          System.out.println("Good MorninG");
          Thread.sleep(1000);
       }
    }
     catch(InterruptedException e){
        System.out.println("Exception is caught");
     }
    }
}
class MyThread2 extends Thread{
    public void run()
    {
       try{
       for(int i=1;i<=5;i++)
       {
          System.out.println("Hello");
          Thread.sleep(2000);
       }
    }
     catch(InterruptedException e){
        System.out.println("Exception is caught");
     }
    }
}
class MyThread3 extends Thread{
    public void run()
    {
       try{
       for(int i=1;i<=5;i++)
       {
          System.out.println("Welcome");
          Thread.sleep(3000);
       }
    }
     catch(InterruptedException e){
        System.out.println("Exception is caught");
     }
    }
}
public class MyThread
{
  public static void main(String[] args)
  {
   MyThread1 t1=new MyThread1();
    t1.start();
   MyThread2 t2=new MyThread2();
    t2.start();
   MyThread3 t3=new MyThread3();
    t3.start();

   }
}