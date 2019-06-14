public abstract class Someclass4 implements Runnable{
    private Object lock = new Object();
    public void lock() {
        synchronized (lock) {
            try {
                lock.wait();
                System.out.print("1");
            } catch (InterruptedException e) {}
        }
    }
    public void notifyThread() {
        synchronized (lock) {
            lock.notify();
        }
    }
    public void unlock() {
        synchronized (lock) {
            lock.notify();
            System.out.print("2");
        }
    }
    public static void main(String s[]) {
        Thread t = new Thread(new Someclass4() {
            public void run() {
                lock();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {}
                notifyThread();
            }
        });
        t.start();
        Thread t1 = new Thread(new Someclass4() {
            public void run() {
                unlock();
            }
        });
        t1.start();
    }
}
