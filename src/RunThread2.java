class RunThread2 implements Runnable {

    private MakeOperations mop;

    public RunThread2(MakeOperations mop) {
        this.mop = mop;
    }

    public void run() {
        mop.doOp(-10);
    }

}