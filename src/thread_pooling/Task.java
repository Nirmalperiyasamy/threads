package thread_pooling;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task implements Runnable {
//    private final String taskName;

//    public Task(String str) {
//        taskName = str;
//    }

    @Override
    public void run() {
        try {
            for (int j = 0; j <= 5; j++) {
                Date dt = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("hh : mm : ss");
                if (j == 0) {

                    System.out.println("Initialization time for the thread name: " + Thread.currentThread().getName() + " = " + sdf.format(dt));

                } else {

                    System.out.println("Time of execution for the thread name: " + Thread.currentThread().getName() + " = " + sdf.format(dt));

                }

                Thread.sleep(1000);
            }

            System.out.println(Thread.currentThread().getName() + " is complete.");
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}

