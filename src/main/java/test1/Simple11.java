package test1;

import java.util.concurrent.Semaphore;

public class Simple11 {
    private volatile boolean simple = true;

    private Semaphore semaphore = new Semaphore(10);

    public boolean getSimple() throws InterruptedException {
        semaphore.acquire(1);
        return simple;

    }

    public void releaseLock(String  threadNo) {
        System.out.println("当前线程自定义编号 "+threadNo+"释放标志===============================");
        if (simple == true){
            simple = false;
            semaphore.release(1);
        }

    }
}
