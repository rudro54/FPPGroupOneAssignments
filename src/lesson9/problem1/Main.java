package lesson9.problem1;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {
    public static void main(String[] args) {
        ArrayQueueImpl queue = new ArrayQueueImpl();
        System.out.println(queue.isEmpty());
        System.out.println(queue);
        System.out.println(queue.peek());

        queue.enqueue(11);
        queue.enqueue(21);
        queue.enqueue(31);
        queue.enqueue(12);
        queue.enqueue(22);
        queue.enqueue(32);
        queue.enqueue(13);
        queue.enqueue(23);
        queue.enqueue(33);
        queue.enqueue(14);
        queue.enqueue(24);
        queue.enqueue(34);
        System.out.println(queue);

        System.out.println(queue.peek());
        System.out.println(queue);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue);

        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
    }
}
