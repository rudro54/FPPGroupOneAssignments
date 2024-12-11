package lesson8.prob4;

public class DoublyLinkedList {

    Node header;
    DoublyLinkedList(){
        header = new Node();
    }
    //1. adds to the end of the list
    public void addLast(String item){
        //implement
        if (item == null || item.isEmpty())
            return;
        Node node = header;
        while(node.next != null)
            node = node.next;
        node.next = new Node(item, node, null);
    }
    // 2. Remove by passing object
    public boolean remove(String item) {
        //Implement
        Node node = header.next;
        while(node!= null) {
            if (node.value.equals(item)) {
                node.previous.next = node.next;
                if(node.next != null)
                    node.next.previous = node.previous;
                return true;
            }
            node = node.next;
        }
        return false;
    }

    // 3. Remove the First Node

    public boolean removeFirst() {
        if (header.next == null)
            return false;
        header.next = header.next.next;
        return true;
    }


    // 4. Prints the list from last to first
    public void printReverse() {
        reverse(header.next);
    }

    private void reverse(Node node) {
        if (node == null)
            return;
        reverse(node.next);
        System.out.print(node.value + " ");
    }


    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        toString(sb, header);
        return sb.toString();

    }
    private void toString(StringBuilder sb, Node n) {
        if(n==null) return;
        if(n.value != null) sb.append(" " + n.value);
        toString(sb, n.next);
    }

    class Node {
        String value;
        Node next;
        Node previous;

        Node() {
            this(null,null,null);
        }

        Node(String value, Node previous, Node next) {
            this.value = value;
            this.previous = previous;
            this.next = next;
        }

        public String toString() {
            return value == null ? "null" : value;
        }
    }

    public static void main(String[] args){
        DoublyLinkedList list = new DoublyLinkedList();
        list.addLast("Bob");
        list.addLast("Harry");
        list.addLast("Steve");
        System.out.println("List: " + list);

        // Call all your implemented Methods
        list.addLast("Roy");
        list.addLast("Zayed");
        System.out.println("List after addLast: " + list);

        list.remove("Steve");
        System.out.println("List after remove Steve: " + list);

        list.removeFirst();
        System.out.println("List after removeFirst: " + list);

        list.printReverse();

    }
}
