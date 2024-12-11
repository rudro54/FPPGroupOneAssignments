package lessonEight.prob4;

public class DoublyLinkedList {
    private Node header;

    public DoublyLinkedList() {
        header = new Node(null, null, null);
    }

    // Adds a string as the last element of the list
    public void addLast(String s) {
        if (s == null) return;
        Node current = header;
        while (current.next != null) {
            current = current.next;
        }
        Node newNode = new Node(current, s, null);
        current.next = newNode;
    }

    // Removes a node containing the string s
    public boolean remove(String s) {
        if (s == null) return false;
        Node current = header.next;
        while (current != null) {
            if (s.equals(current.value)) {
                if (current.next != null) {
                    current.next.previous = current.previous;
                }
                if (current.previous != null) {
                    current.previous.next = current.next;
                }
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Removes the first node
    public boolean removeFirst() {
        if (header.next == null) return false; // List is empty
        Node first = header.next;
        header.next = first.next;
        if (first.next != null) {
            first.next.previous = header;
        }
        return true;
    }

    // Prints the list in reverse order
    public void printReverse() {
        Node current = header;
        while (current.next != null) {
            current = current.next;
        }
        StringBuilder sb = new StringBuilder("[");
        while (current != header) {
            sb.append(current.value);
            current = current.previous;
            if (current != header) {
                sb.append(", ");
            }
        }
        sb.append("]");
        System.out.println(sb.toString());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node current = header.next;
        while (current != null) {
            sb.append(current.value);
            current = current.next;
            if (current != null) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    private class Node {
        String value;
        Node next;
        Node previous;

        Node(Node previous, String value, Node next) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }
    }
}


