public class SynchronizedThread {
    public static void main(String[] args) {

        MakeOperations mop = new MakeOperations();

        Thread t_1 = new Thread(new RunThread1(mop), "T_SOMMA");
        Thread t_2 = new Thread(new RunThread2(mop), "T_SOTTRAZIONE");

        t_1.start();
        t_2.start();

    }
}
