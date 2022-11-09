import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ImplQueue queue = new ImplQueue(n);
        for (;n-- > 0;) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push":
                    queue.push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    queue.pop();
                    break;
                case "front":
                    queue.front();
                    break;
                case "back":
                    queue.back();
                    break;
                case "size":
                    queue.size();
                    break;
                case "empty":
                    queue.empty();
                    break;
            }
        }
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

    public void pop(){
        if(back - front == 0) {
            System.out.println("-1");
        }else {
            System.out.println(queue[front]);
            queue[front++] = 0;
        }
    }

    public void empty(){
        if(back - front == 0){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }

    public void size(){
        System.out.println(back-front);
    }

    public void front(){
        if(back - front == 0) {
            System.out.println("-1");
        }else {
            System.out.println(queue[front]);
        }
    }

    public void back(){
        if(back - front == 0) {
            System.out.println("-1");
        }else {
            System.out.println(queue[back-1]);
        }
    }
}