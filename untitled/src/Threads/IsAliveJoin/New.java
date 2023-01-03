package Threads.IsAliveJoin;

public class New {
    public static void main(String[] args) {
        NewThread obj1 = new NewThread("One");
        System.out.println("Thread One is alive:" + obj1.t.isAlive());
        //wait for thread to finish
        try{
            System.out.println("Waiting for thread to finish");
            obj1.t.join();

        }catch (InterruptedException e){
            System.out.println("Main thread Interrupted");
        }
        NewThread obj2 = new NewThread("Two");
        System.out.println("Thread two is alive" + obj2.t.isAlive());

        NewThread obj3 = new NewThread("Two");
        System.out.println("Thread three is alive" + obj3.t.isAlive());

        System.out.println("Thread is alive" + obj1.t.isAlive());
        System.out.println("Thread is alive" + obj2.t.isAlive());
        System.out.println("Thread is alive" + obj3.t.isAlive());
    }
}
