package meow;

public class synchroex {
    public static synchronized void speak() {
        System.out.println("Hello World");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hello Aaryan");
    }
    public static void main(String[] args) {
        Thread t = new Thread(new A());
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        speak();
    }
}
class A implements Runnable {
    @Override
    public void run() {
        synchroex.speak();
    }

}
