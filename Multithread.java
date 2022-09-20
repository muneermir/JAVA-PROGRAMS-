
public class Multithread 1 implements Runnable
{
       public static void main(String[] args) {
        Thread MultiThread1 = new Thread("Thread1");
        Thread MultiThread2 = new Thread("Thread2");
        MultiThread1.start();
        MultiThread2.start();
        System.out.println("Thread names are following:");
        System.out.println(MultiThread1.getName());
        System.out.println(MultiThread2.getName());
    }
    @Override
    public void run() {
    }
}
