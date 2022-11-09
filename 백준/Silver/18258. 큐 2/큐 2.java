import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        ImplQueue queue = new ImplQueue(n);
        while(n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push":
                    queue.push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    sb.append(queue.pop()).append("\n");
                    break;
                case "front":
                    sb.append(queue.front()).append("\n");
                    break;
                case "back":
                    sb.append(queue.back()).append("\n");
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    sb.append(queue.empty()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}

class ImplQueue{
    private int front;
    private int back;
    private int[] queue;

    public ImplQueue(int memory){
        this.queue = new int[memory];
        front = back = 0;
    }

    public void push(int val){
        queue[back++] = val;
    }

    public int pop(){
        if(size() == 0) {
            return -1;
        }else {
            int val = queue[front];
            queue[front++] = 0;
            return val;
        }
    }

    public int empty(){
        if(size() == 0){
            return 1;
        }else{
            return 0;
        }
    }

    public int size(){
        return back-front;
    }

    public int front(){
        if(size() == 0) {
            return -1;
        }else {
            return queue[front];
        }
    }

    public int back(){
        if(size() == 0) {
            return -1;
        }else {
            return queue[back-1];
        }
    }
}