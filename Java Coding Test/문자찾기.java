import java.util.*;

class CodeTest{
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        System.out.print(T.solution(str,c));
    }
}

class Main {
    public int solution(String str, char c){
        str = str.toLowerCase();
        int cnt = 0;
        for(int i = 0 ; i < str.length(); i++)
            if (str.charAt(i) == c) cnt++;
            return cnt;
    }
}
