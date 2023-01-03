package Threads.ExtendThreadClass;

public class Main {
    public static void main(String[] args) {
        SequencePrinterThread sequencePrinter1 = new SequencePrinterThread(0, 5);
        sequencePrinter1.setName("Sequence Printer First");

        SequencePrinterThread sequencePrinter2 = new SequencePrinterThread(6, 18);
        sequencePrinter2.setName("Sequence Printer Second");

        sequencePrinter1.start();
        sequencePrinter2.start();
    }
}
