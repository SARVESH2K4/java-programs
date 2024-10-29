class Box<T> {
    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}

public class GenericsExample {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.setContent("Hello Generics");
        System.out.println(box.getContent());
    }
}
