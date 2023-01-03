package Threads;

public class CurrentThread {
    public static void main(String[] args){
        Thread currentThread =Thread.currentThread();  //currentThread() static method
        System.out.println("Current Thread" + currentThread.getName());
        currentThread.setName("My Thread");
        System.out.println("After name changed Current Thread" + currentThread.getName());

        try{
            for (int n=5; n>0; n--){
                System.out.println(n);
                Thread.sleep(1000);
            }
        }

        catch(InterruptedException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
