
class ExampleThread extends Thread{
    public void run(){
        System.out.println("Thread is running");
    }


}

public class MyThread {
    public  static void main(String args[]){
        ExampleThread t1=new ExampleThread();
        t1.start();
    }
}
