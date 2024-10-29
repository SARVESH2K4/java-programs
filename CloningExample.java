class Person implements Cloneable {
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloningExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person("John");
        Person person2 = (Person) person1.clone();

        System.out.println("Person1 name: " + person1.name);
        System.out.println("Person2 name: " + person2.name);
    }
}
