package lesson8.prob4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DoublyLinkedListTest {

    @Test
    public void testAddLast() {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addLast("Alice");
        list.addLast("Bob");
        assertEquals(" Alice Bob", list.toString());
    }

    @Test
    public void testAddLastWithNullOrEmpty() {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addLast(null);
        list.addLast("");
        assertEquals("", list.toString());
    }

    @Test
    public void testRemove() {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addLast("Alice");
        list.addLast("Bob");
        list.addLast("Charlie");
        assertTrue(list.remove("Bob"));
        assertEquals(" Alice Charlie", list.toString());
    }

    @Test
    public void testRemoveNonExistentItem() {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addLast("Alice");
        list.addLast("Bob");
        assertFalse(list.remove("Charlie"));
        assertEquals(" Alice Bob", list.toString());
    }

    @Test
    public void testRemoveFirst() {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addLast("Alice");
        list.addLast("Bob");
        assertTrue(list.removeFirst());
        assertEquals(" Bob", list.toString());
    }

    @Test
    public void testRemoveFirstOnEmptyList() {
        DoublyLinkedList list = new DoublyLinkedList();
        assertFalse(list.removeFirst());
    }

    @Test
    public void testPrintReverse() {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addLast("Alice");
        list.addLast("Bob");
        list.addLast("Charlie");
        list.addLast("David");

        System.out.print("Reversed List: ");
        list.printReverse(); // Output should be "David Charlie Bob Alice"
        System.out.println();
    }

    @Test
    public void testToString() {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addLast("Alice");
        list.addLast("Bob");
        list.addLast("Charlie");
        assertEquals(" Alice Bob Charlie", list.toString());
    }

    @Test
    public void testToStringEmptyList() {
        DoublyLinkedList list = new DoublyLinkedList();
        assertEquals("", list.toString());
    }
}
