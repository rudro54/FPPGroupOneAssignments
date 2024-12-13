package lesson9.problem2;


import java.util.LinkedList;
import java.util.List;

public class ArrayStack {
    private List<Integer> arr = new LinkedList<Integer>();

    public void push(Integer x) {
        if(x == null) return;
        arr.add(x);
    }
    public Integer peek() {
        return arr.isEmpty() ? null : arr.getLast();
    }
    public Integer pop() {
        return arr.isEmpty() ? null : arr.removeLast();
    }
    public boolean isEmpty(){ // true if stack is empty
        return arr.isEmpty();
    }
    public int size(){ // returns number of items in the stack
        return arr.size();
    }

    @Override
    public String toString() {
        if(isEmpty()) return "<empty>";
        StringBuilder sb = new StringBuilder();
        for(Integer x : arr) {
            if(x != null)
                sb.append(x.toString()).append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        ArrayStack st = new ArrayStack();
        st.push(1);
        st.push(2);
        System.out.println(st);
        System.out.println("Size = " + st.size());
        System.out.println(st.isEmpty());
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
    }
}
