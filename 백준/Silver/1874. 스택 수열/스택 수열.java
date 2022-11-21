import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Stack s = new Stack();

        int idx = 0;
        for(int i = 1 ; i <= n ; i++){
            s.push(i);
            sb.append("+\n");
            while(!s.empty()) {
                if (s.peek().equals(arr[idx])) {
                    s.pop();
                    sb.append("-\n");
                    idx++;
                } else {
                    break;
                }
            }
        }
        if(s.empty()){
            System.out.println(sb);
        }else{
            System.out.println("NO");
        }
    }
}