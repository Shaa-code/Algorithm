import java.util.*;

class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int m = kb.nextInt();
        int n = kb.nextInt();
        int l = kb.nextInt();
        System.out.println(T.solution(m,n,l));
    }

    public int solution(int m, int n, int l) {
        if((n == m) && (m == l) && (n == l)){
            return 10000+n*1000;
        } else if((n == m) || (n == l)) {
            return 1000 + n * 100;
        }else if(m == l){
            return 1000 + m * 100;
        } else{
            return Math.max(Math.max(m,n),l) * 100;
        }
    }
}