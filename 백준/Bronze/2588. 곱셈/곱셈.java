import java.util.*;

class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int Num1 = kb.nextInt();
        int Num2 = kb.nextInt();
        T.solution(Num1, Num2);
    }

    public void solution(int Num1, int Num2){
        System.out.println(Num2 % 10 * Num1);
        System.out.println(Num2 % 100 / 10 * Num1);
        System.out.println(Num2 % 1000 / 100 * Num1);
        System.out.println(Num2 * Num1);
    }
}