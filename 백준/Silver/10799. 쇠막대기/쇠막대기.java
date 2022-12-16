import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Main T = new Main();
        System.out.println(T.solution(str));
    }
    public int solution(String str){
        Stack<Character> s = new Stack();
        int cnt = 0;
        char tmp = ' ';
        for(char x: str.toCharArray()){
            if(x == '('){
                s.push(x);
            }else{
                s.pop();
                if(tmp == ')') {
                    cnt++;
                    continue;
                }
                cnt += s.size();
            }
            tmp = x;
        }
        return cnt;
    }
}