class RunThread1 implements Runnable {

    private MakeOperations mop;

    public RunThread1(MakeOperations mop) {
        this.mop = mop;
    }

    public void run() {
        mop.doOp(10);
    }

}