import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n ; i++) {
            boolean flag = false;
            char[] str = br.readLine().toCharArray();
            Stack s = new Stack();
            for(char c : str){
                if( c == '('){
                    s.push(c);
                }else{
                    if(!s.empty()) {
                        s.pop();
                    }else{
                        flag = true;
                        break;
                    }
                }
            }

            if(flag == true){
                System.out.println("NO");
            }else if(!s.empty()){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}
