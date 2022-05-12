import java.util.*;

class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++)
            arr[i] = kb.nextInt();

        System.out.println(T.solution(n,arr));
    }

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> ret = new ArrayList<>();
        ret.add(arr[0]);
        for(int i = 1 ; i < n ; i++)
            if(arr[i]>arr[i-1])
                ret.add(arr[i]);
        return ret;
        }
}
