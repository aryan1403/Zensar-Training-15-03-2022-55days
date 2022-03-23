package meow;

public class threadex {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Impl());
        Thread t2 = new Thread(new Impl1());
        // sleep
        /* try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } */
        // System.out.println(t1.isAlive()); // it is not started = false
        t1.start();
        try {
            t1.join(); // this is running other threads have to wait until the work is done
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");
        }
        // t2.start();
        // System.out.println(t1.isAlive()); // running = true
    }
}

class Impl implements Runnable {
    @Override
    public void run() {
        // Task
        for (int i = 0; i < 10; i++) {
            System.out.println("Aaryan");
        }
        
    }
}

class Impl1 implements Runnable {
    @Override
    public void run() {
        // Task
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");
        }
        
    }
}
