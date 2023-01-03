package Threads.ImplementingRunnableClass;

public class RunnableSequencePrinter implements Runnable {
    private int from;
    private int to;

    RunnableSequencePrinter(int from ,int to){
        this.from = from;
        this.to = to;
    }

    public void run()
    {
        for(int i=from; i<=to; i++)
        {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }
}
