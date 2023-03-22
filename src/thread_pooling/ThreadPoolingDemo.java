package thread_pooling;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolingDemo {
    private static final int numberOfThread = 3;

    public static void main(String[] args) {

        Runnable rb1 = new Task();
        Runnable rb2 = new Task();
        Runnable rb3 = new Task();
        Runnable rb4 = new Task();
        Runnable rb5 = new Task();

        ExecutorService executorService = Executors.newFixedThreadPool(numberOfThread);

        executorService.execute(rb1);
        executorService.execute(rb2);
        executorService.execute(rb3);
        executorService.execute(rb4);
        executorService.execute(rb5);

        executorService.shutdown();
    }
}
