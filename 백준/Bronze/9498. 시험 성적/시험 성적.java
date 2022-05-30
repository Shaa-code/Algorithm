import java.util.*;

class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int Num1 = kb.nextInt();
        T.solution(Num1);
    }

    public void solution(int Num1){
        try {
            if (90 <= Num1 && Num1 <= 100) System.out.println("A");
            else if (80 <= Num1 && Num1 < 90) System.out.println("B");
            else if (70 <= Num1 && Num1 < 80) System.out.println("C");
            else if (60 <= Num1 && Num1 < 70) System.out.println("D");
            else System.out.println("F");
        }catch(Exception e){
            System.out.println("ERROR");
        }
    }
}