package practice;

public class MyClass { // Outer class/Enclosing class
    private String s = "hello";
    int intval = 1;
    public static void main(String[] args){
        new MyClass();
    }
    MyClass() {
        MyInnerClass myInner = new MyInnerClass();
        System.out.println(myInner.intval);
        myInner.innerMethod();
    }
    class MyInnerClass {
        private String s = "hellox";
        private int intval = 3;
        private void innerMethod(){
            System.out.println(MyClass.this.s);
        }
    }
}