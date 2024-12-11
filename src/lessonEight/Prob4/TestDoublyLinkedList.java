package lessonEight.Prob4;

public class TestDoublyLinkedList {

    // Test the implementation
    public static void main(String[] args) {
        lessonEight.prob4.DoublyLinkedList list = new lessonEight.prob4.DoublyLinkedList();

        // Add elements
        list.addLast("Bob");
        list.addLast("Bill");
        list.addLast("Tom");
        System.out.println("List after additions: " + list);

        // Add "Carol" at the end
        list.addLast("Carol");
        System.out.println("List after adding Carol: " + list);

        // Remove "Bill"
        list.remove("Bill");
        System.out.println("List after removing Bill: " + list);

        // Remove the first element
        list.removeFirst();
        System.out.println("List after removing the first element: " + list);

        // Print in reverse order
        System.out.print("List in reverse order: ");
        list.printReverse();
    }
}


