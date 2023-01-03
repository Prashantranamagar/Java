package Threads.ImplementingRunnableClass;

public class Main {
    public static void main(String[] args) {
        RunnableSequencePrinter runnableSequencePrinter = new RunnableSequencePrinter(0, 100);
        RunnableSequencePrinter runnableSequencePrinter1 = new RunnableSequencePrinter(600, 800);

        new Thread(runnableSequencePrinter).start();
        new Thread(runnableSequencePrinter1).start();

    }
}
