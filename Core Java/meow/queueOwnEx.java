package meow;

public class queueOwnEx {
    public static void main(String[] args) {
        queueOwn q = new queueOwn();

        q.offer(20);
        q.offer(30);
        q.offer(114);

        q.poll();

        System.out.println(q);
    }
}
