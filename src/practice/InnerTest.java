package practice;

public class InnerTest {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        System.out.println(myClass.intval);
        ClassA classA = new ClassA();
        ClassA.InnerClassA innerClassA = classA.new InnerClassA();
        innerClassA.action();
    }
}

class ClassA {
     class InnerClassA {
         void action() {
            System.out.println("InnerClassA.action");
        }
    }
}