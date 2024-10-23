class Queue {
    int[] arr;
    int front, rear, capacity, count;

    Queue(int size) {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    public void enqueue(int data) {
        if (count == capacity) {
            System.out.println("Queue Overflow");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = data;
        count++;
    }

    public int dequeue() {
        if (count == 0) {
            System.out.println("Queue Underflow");
            // return -1;
        }
        int data = arr[front];
        front = (front + 1) % capacity;
        count--;
        return data;
    }

    public int peek() {
        if (count == 0) {
            System.out.println("Queue is empty");
            // return -1;
        }
        return arr[front];
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Front element: " + queue.peek());
        queue.dequeue();
        System.out.println("After dequeue, front element: " + queue.peek());
    }
}
