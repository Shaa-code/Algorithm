import java.util.*;

class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int A = kb.nextInt();
        int B = kb.nextInt();
        int C = kb.nextInt();
        T.solution(A,B,C);
    }

    public void solution(int A , int B , int C){
        System.out.println((A+B)%C);
        System.out.println(((A+C)+(B%C))%C);
        System.out.println((A*B)%C);
        System.out.println(((A%C)*(B%C))%C);
    }
}