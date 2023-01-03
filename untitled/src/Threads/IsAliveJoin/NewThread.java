package Threads.IsAliveJoin;

public class NewThread implements Runnable{
    String name;
    Thread t;

    NewThread(String threadName){
        this.name = threadName;
        t = new Thread(this, this.name);
        System.out.println("New thread:" + t);
        t.start();
    }
    public void run(){
        try{
            for(int i = 5; i>0; i--){
                System.out.println(this.name + ":" + i);
                Thread.sleep(1000);
            }

        }catch (InterruptedException e){
            System.out.println(this.name + "interrupted.");
        }
        System.out.println(this.name + "exiting");
    }
}
