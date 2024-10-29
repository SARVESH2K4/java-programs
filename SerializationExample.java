import java.io.*;

class Employee implements Serializable {
    String name;

    public Employee(String name) {
        this.name = name;
    }
}

public class SerializationExample {
    public static void main(String[] args) {
        try {
            Employee emp = new Employee("Sarvesh");

            // Serialization
            FileOutputStream fileOut = new FileOutputStream("employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(emp);
            out.close();

            // Deserialization
            FileInputStream fileIn = new FileInputStream("employee");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Employee deserializedEmp = (Employee) in.readObject();
            in.close();

            System.out.println("Deserialized Employee name: " + deserializedEmp.name);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
