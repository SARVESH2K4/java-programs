interface Movable {
    void move();
}

interface Printable {
    void print();
}

class Robot implements Movable, Printable {
    public void move() {
        System.out.println("Robot is moving");
    }

    public void print() {
        System.out.println("Robot is printing");
    }
}

public class MultipleInheritanceExample {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.move();
        robot.print();
    }
}
