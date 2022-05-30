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
        if(Num1 > 0 && Num2 > 0) System.out.println("1");
        else if(Num1 > 0 && Num2 < 0) System.out.println("4");
        else if(Num1 < 0 && Num2 < 0) System.out.println("3");
        else System.out.println("2");
    }
}