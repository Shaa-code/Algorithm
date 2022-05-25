import java.util.*;

class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, arr));
    }

    public int solution(int n, int[] arr) {
        int tmp = arr[0];
        int cnt = 1;
        for (int i = 1; i < n; i++) {
            if (tmp < arr[i])
                cnt += 1;
            tmp = arr[i];
        }
        return cnt;
    }
}
