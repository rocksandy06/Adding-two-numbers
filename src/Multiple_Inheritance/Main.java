package Multiple_Inheritance;

interface InterfaceA {
    void methodA();
}

interface InterfaceB {
    void methodB();
}

class MyClass implements InterfaceA, InterfaceB {
    public void methodA() {
        System.out.println("A:");
    }

    public void methodB() {
        System.out.println("B:");
    }

    public void myMethod() {
        System.out.println("MyClass specific method");
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass d = new MyClass();
        d.methodA(); 
        System.out.println("santhosh");
        d.methodB(); 
        System.out.println("kumar");
        d.myMethod();
        
        
        
    }
}