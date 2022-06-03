import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        T.solution(n);
    }
    public void solution(int n){
        int i = 1;
        while(i < 10) {
            System.out.printf("%d * %d = %d\n",n ,i, n*i);
            i++;
        }
    }
}