package threads.test;


class ThreadExampleRunable2 implements Runnable {
    private final String c;

    public ThreadExampleRunable2(String c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 1000; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }
            Thread.yield();
        }
    }
}

    public class ThreadTest02 {
        public static void main(String[] args) throws InterruptedException {
            Thread t1 = new Thread(new ThreadExampleRunable2("KA"));
            Thread t2 = new Thread(new ThreadExampleRunable2("ME"));
            t1.setPriority(Thread.MAX_PRIORITY);
            t1.start();
            t1.join();
            t2.start();
        }
    }
