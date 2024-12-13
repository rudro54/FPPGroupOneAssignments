package lesson9;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayQueueImplTest {

    @Test
    public void testPeekEmptyQueue() {
        ArrayQueueImpl queue = new ArrayQueueImpl();
        assertEquals(-1, queue.peek(), "Peek should return -1 for an empty queue.");
    }

    @Test
    public void testPeekAfterEnqueue() {
        ArrayQueueImpl queue = new ArrayQueueImpl();
        queue.enqueue(10);
        queue.enqueue(20);
        assertEquals(10, queue.peek(), "Peek should return the first element (10) after enqueue.");
    }

    @Test
    public void testEnqueueAndDequeue() {
        ArrayQueueImpl queue = new ArrayQueueImpl();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        assertEquals(10, queue.dequeue(), "Dequeue should return the first element (10).");
        assertEquals(20, queue.dequeue(), "Dequeue should return the second element (20).");
        assertEquals(30, queue.dequeue(), "Dequeue should return the third element (30).");
    }

    @Test
    public void testDequeueEmptyQueue() {
        ArrayQueueImpl queue = new ArrayQueueImpl();
        assertEquals(-1, queue.dequeue(), "Dequeue should return -1 for an empty queue.");
    }

    @Test
    public void testIsEmpty() {
        ArrayQueueImpl queue = new ArrayQueueImpl();
        assertTrue(queue.isEmpty(), "Queue should be empty initially.");
        queue.enqueue(10);
        assertFalse(queue.isEmpty(), "Queue should not be empty after enqueue.");
        queue.dequeue();
        assertTrue(queue.isEmpty(), "Queue should be empty after dequeuing all elements.");
    }

    @Test
    public void testSize() {
        ArrayQueueImpl queue = new ArrayQueueImpl();
        assertEquals(0, queue.size(), "Size should be 0 initially.");
        queue.enqueue(10);
        queue.enqueue(20);
        assertEquals(2, queue.size(), "Size should be 2 after enqueueing two elements.");
        queue.dequeue();
        assertEquals(1, queue.size(), "Size should be 1 after dequeuing one element.");
        queue.dequeue();
        assertEquals(0, queue.size(), "Size should be 0 after dequeuing all elements.");
    }

    @Test
    public void testResize() {
        ArrayQueueImpl queue = new ArrayQueueImpl();
        for (int i = 0; i < 15; i++) {
            queue.enqueue(i);
        }
        assertEquals(15, queue.size(), "Size should be 15 after enqueueing 15 elements.");
        for (int i = 0; i < 15; i++) {
            assertEquals(i, queue.dequeue(), "Dequeue should return elements in the correct order.");
        }
        assertTrue(queue.isEmpty(), "Queue should be empty after dequeuing all elements.");
    }

    @Test
    public void testToString() {
        ArrayQueueImpl queue = new ArrayQueueImpl();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        assertTrue(queue.toString().contains("Front"), "toString should contain 'Front'.");
        assertTrue(queue.toString().contains("Rear"), "toString should contain 'Rear'.");
        assertTrue(queue.toString().contains("Size: 3"), "toString should show the correct size.");
    }
}
