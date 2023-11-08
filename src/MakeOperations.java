import java.util.Random;

class MakeOperations {
    private int data;

    public synchronized void doOp(int v) {

        for (int i = 0; i < 5; i++) {

            try {

                Thread.sleep(new Random().nextInt(6000));
                data += v;
                System.out.printf("Il valore del dato dal thread %s è di %d%n", Thread.currentThread().getName(), getRes());

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }

    public int getRes() {
        return data;
    }

}