

class RunnableClass implements Runnable{
    public void run(){
        System.out.println("Runnable Class is Running");
    }
}
public class MyRunnable {
    public static void main(String[] args) {
        Thread t1=new Thread(new RunnableClass());
        t1.start();
    }
}
