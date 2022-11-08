import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayStack AS = new ArrayStack(n);
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String token = st.nextToken();
            switch(token){
                case "push":
                    AS.push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    AS.pop();
                    break;
                case "size":
                    AS.size();
                    break;
                case "empty":
                    AS.empty();
                    break;
                case "top":
                    AS.top();
                    break;
            }
        }
    }
}

class ArrayStack{

    private int top;
    private int size;
    private int stack[];

    ArrayStack(int memory){
        this.size = 0;
        this.top = -1;
        this.stack = new int[memory];
    }

    public void push(int data){
        stack[++top] = data;
        size++;
    }

    public void pop(){
        if(this.size == 0){
            System.out.println("-1");
        }else {
            System.out.println(stack[top]);
            stack[top] = 0;
            top--;
            size--;
        }
    }

    public void top(){
        if(this.size == 0) {
            System.out.println("-1");
        }else{
            System.out.println(stack[top]);
        }
    }

    public void size(){
        System.out.println(this.size);
    }

    public void empty(){
        if(this.size == 0){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}
