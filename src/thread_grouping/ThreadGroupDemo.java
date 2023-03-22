package thread_grouping;

public class ThreadGroupDemo implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().getThreadGroup());

    }

    public static void main(String[] args) throws InterruptedException {

        ThreadGroupDemo threadGroupDemo = new ThreadGroupDemo();

        ThreadGroup threadGroup1 = new ThreadGroup("Group A");

        Thread thread1 = new Thread(threadGroup1, threadGroupDemo, "one");
        thread1.start();
        System.out.println(threadGroup1.activeCount());

        Thread thread2 = new Thread(threadGroup1,threadGroupDemo,"two");
        thread2.start();

        Thread thread3 = new Thread(threadGroup1,threadGroupDemo,"three");
//        Thread.sleep(5000);
        thread3.start();

        System.out.println("Thread group name " + threadGroup1.getName());
        System.out.println(thread3.getPriority());
        System.out.println(thread2.getPriority());

        System.out.println(threadGroup1.activeCount());
        System.out.println(threadGroup1.activeGroupCount());
        System.out.println(threadGroup1.getMaxPriority());

        System.out.println(threadGroup1.getParent().getName());
//        threadGroup1.list();

    }


}
