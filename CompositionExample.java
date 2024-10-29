class Engine {
    public void start() {
        System.out.println("Engine is starting");
    }
}

class Car {
    private Engine engine = new Engine(); // Composition
    
    public void drive() {
        engine.start();
        System.out.println("Car is driving");
    }
}

public class CompositionExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
    }
}
