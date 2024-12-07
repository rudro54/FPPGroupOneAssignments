package practice;

public class Outer {
    private int data = 10;
    public  static void main(String[] args) {
        Outer o = new Outer();
        o.printVal(20);
    }
    void printVal(int bound) {
        if(data < bound) {
            class Inner {
                public int getValue() {
                    return data;
                }
            }
            Inner inner = new Inner();
            System.out.println("Inside inner: " + inner.getValue());
        } else {
            System.out.println("Outside inner: " + (data - bound));
        }
    }
}
