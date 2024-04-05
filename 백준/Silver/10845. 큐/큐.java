import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main<T> {
    private int capacity;
    private int size;
    private int front;
    private int rear;
    private T[] queue;

    public Main() {
        capacity = 5;
        size = 0;
        front = 0;
        rear = -1;
        queue = (T[]) new Object[capacity];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(T item) {
        if (isEmpty()) {
            front = 0;
            rear = -1;
        }

        if (size == capacity) {
            resize(2 * capacity);
        }
        rear = (rear + 1) % capacity;
        queue[rear] = item;
        size++;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println(-1);
            return;
        }
        T item = queue[front];
        queue[front] = null; // 아이템 삭제
        front = (front + 1) % capacity;
        size--;
        System.out.println(item);
    }


    public int size() {
        return size;
    }

    private void resize(int newCapacity) {
        T[] newQueue = (T[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newQueue[i] = queue[(front + i) % capacity];
        }
        queue = newQueue;
        front = 0;
        rear = size - 1;
        capacity = newCapacity;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue[front];
    }

    public T peekLast() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue[rear];
    }

    public static void main(String[] args) throws IOException {
        Main<Integer> main = new Main<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int len = Integer.parseInt(br.readLine());

        for (int i = 0; i < len; i++) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            String command = tokenizer.nextToken();

            switch (command) {
                case "push":
                    main.enqueue(Integer.parseInt(tokenizer.nextToken()));
                    break;
                case "pop":
                    main.dequeue();
                    break;
                case "size":
                    System.out.println(main.size());
                    break;
                case "empty":
                    System.out.println(main.isEmpty() ? 1 : 0);
                    break;
                case "front":
                    System.out.println(!main.isEmpty() ? main.peek() : -1);
                    break;
                case "back":
                    System.out.println(!main.isEmpty() ? main.peekLast() : -1);
                    break;
            }
        }

        br.close();
    }

}
