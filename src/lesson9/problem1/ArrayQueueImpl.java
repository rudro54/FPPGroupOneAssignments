package lesson9.problem1;

import java.util.Arrays;

public class ArrayQueueImpl {
    private int[] arr = new int[10];
    private int front = -1;
    private int rear = 0;

    public int peek() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front+1];
    }
    public void enqueue(int obj) {
        if( size() == arr.length)
            resize();
        if(arr.length > size())
            arr[rear++] = obj;
    }
    public int dequeue() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[++front];
    }
    public boolean isEmpty(){
        return size() == 0;
    }
    public int size() {
        return rear - front - 1;
    }
    private void resize(){
        int [] newArray = new int[arr.length+10];
        int index = 0;
        for(int value : arr)
            newArray[index++] = value;
        arr = newArray;
    }

    @Override
    public String toString() {
        return "\n---\n" + "Front: " + front + " " + "Rear: " + rear + " " + "Size: " + size() + "\n" + Arrays.toString(arr) + "\n---\n" ;
    }
}