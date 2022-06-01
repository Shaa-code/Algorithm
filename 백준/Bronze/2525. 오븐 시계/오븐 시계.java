import java.util.*;

class Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int h = kb.nextInt();
        int m = kb.nextInt();
        int c = kb.nextInt();
        T.solution(h, m, c);
    }

    public void solution(int h, int m,int c) {
        //분이 60분이 넘으면 1. 시간 +1, 2. 분
        h += c/60;
        m += c%60;

        if(m > 59) {
            h++;
            m -= 60;
        }
        if(h > 23){
            h -= 24;
        }
        System.out.print(h + " " + m);
    }
}