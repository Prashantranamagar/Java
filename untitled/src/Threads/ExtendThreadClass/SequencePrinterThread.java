package Threads.ExtendThreadClass;


public class SequencePrinterThread extends Thread{
    private int from;
    private int to;

    SequencePrinterThread(int from, int to)
    {
        this.from = from;
        this.to =to;

    }
    public void run()
    {
        try{
            for(int i = from; i<= to; i++){
                System.out.println(Thread.currentThread().getName());
                System.out.printf("%d", i);
                System.out.println();
                Thread.sleep(500);

            }
            System.out.println("Existing Thread:"+ Thread.currentThread().getName());

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println();
    }
}
