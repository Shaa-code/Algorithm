import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque d = new Deque(n);
        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push_back":
                    d.push_back(Integer.parseInt(st.nextToken()));
                    break;
                case "push_front":
                    d.push_front(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    sb.append(d.pop_front()).append('\n');
                    break;
                case "pop_back":
                    sb.append(d.pop_back()).append('\n');
                    break;
                case "size":
                    sb.append(d.size()).append('\n');
                    break;
                case "empty":
                    sb.append(d.empty()).append('\n');
                    break;
                case "front":
                    sb.append(d.front()).append('\n');
                    break;
                case "back":
                    sb.append(d.back()).append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }
}
class Deque {
    private int[] deque;
    private int size;
    private int front;
    private int back;

    Deque(int memory) {
        this.deque = new int[memory];
        this.size = 0;
        this.front = 0;
        this.back = 0;
    }

    public void push_front(int val) {
        deque[front] = val;
        front = (front - 1 + deque.length) % deque.length;
        size++;
    }

    public void push_back(int val) {
        back = (back + 1) % deque.length;
        deque[back] = val;
        size++;
    }

    public int pop_front() {

        if (isEmpty()) {
            return -1;
        }

        int ret = deque[(front + 1) % deque.length];
        deque[(front + 1) % deque.length] = 0;
        front = (front + 1) % deque.length;
        size--;

        return ret;
    }

    public int pop_back() {
        if (isEmpty()) {
            return -1;
        }

        int ret = deque[back];
        deque[back] = 0;
        back = (back - 1 + deque.length) % deque.length;
        size--;

        return ret;
    }

    public int empty() {
        if (isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }

    public int front() {
        if(isEmpty()){
            return -1;
        }
        return deque[(front + 1) % deque.length];
    }

    public int back() {
        if(isEmpty()){
            return -1;
        }
        return deque[back];
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }
}
