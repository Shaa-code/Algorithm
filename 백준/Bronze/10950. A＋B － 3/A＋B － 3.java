import java.util.*;
class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        int i = 0;
        int n1, n2;

        while (i < t) {
            n1 = kb.nextInt();
            n2 = kb.nextInt();
            i++;
            System.out.println(n1 + n2);
        }
    }
}