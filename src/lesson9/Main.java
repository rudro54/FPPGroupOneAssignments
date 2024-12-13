package lesson9;

public class Main {
    public static void main(String[] args) {
        ArrayQueueImpl queue = new ArrayQueueImpl();
        queue.enqueue(10);
        queue.enqueue(20);
        System.out.println(queue.peek());
        System.out.println(queue);



    }
}
