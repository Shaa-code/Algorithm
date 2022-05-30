import java.util.*;

class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int Int1 = kb.nextInt();
        int Int2 = kb.nextInt();
        T.solution(Int1,Int2);
    }

    public void solution(int Int1 , int Int2){
        System.out.println(Int1 + Int2);
        System.out.println(Int1 - Int2);
        System.out.println(Int1 * Int2);
        System.out.println(Int1 / Int2);
        System.out.println(Int1 % Int2);
    }
}