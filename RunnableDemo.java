public class RunnableDemo implements Runnable {
    private Thread th;
    private String threadName;

    RunnableDemo(String name) {
        threadName = name;
        System.out.println("Creating :" + threadName);
    }

    public void run() {
        System.out.println("Running :" + threadName);
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                Thread.sleep(1000);
            }

        } catch (InterruptedException e) {
            System.out.println("Thread: " + threadName + " Interrupt.");
        }
        System.out.println("Thread: " + threadName + "Existing.");
    }

    public void start() {
        System.out.println("Starting: " + threadName);
        if (th == null) {
            th = new Thread(this, threadName);
            th.start();
        }
    }
}
