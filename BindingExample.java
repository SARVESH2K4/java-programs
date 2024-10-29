class Parent {
    static void staticMethod() {
        System.out.println("Parent static method");
    }

    void instanceMethod() {
        System.out.println("Parent instance method");
    }
}

class Child extends Parent {
    static void staticMethod() {
        System.out.println("Child static method");
    }

    @Override
    void instanceMethod() {
        System.out.println("Child instance method");
    }
}

public class BindingExample {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.staticMethod(); // Static binding
        parent.instanceMethod(); // Dynamic binding
    }
}
