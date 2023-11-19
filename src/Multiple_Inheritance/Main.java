package Multiple_Inheritance;
interface Interface1 {
    void method1();
}

interface Interface2 {
    void method2();
}

class MyClass implements Interface1, Interface2 {
    public void method1() {
        System.out.println("Method 1 implementation");
    }

    public void method2() {
        System.out.println("Method 2 implementation");
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass myObj = new MyClass();
        myObj.method1();
        myObj.method2();
    }
}