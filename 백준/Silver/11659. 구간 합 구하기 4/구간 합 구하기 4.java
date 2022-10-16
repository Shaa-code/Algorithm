import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int A[] = new int[n];
        int S[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            A[i] = kb.nextInt();
            if(i == 0) {
                S[i] = A[i];
            }else{
                S[i] = S[i - 1] + A[i];
            }
        }
        for(int i = 0 ; i < m ; i++){
            int start = kb.nextInt();
            int end = kb.nextInt();
            if(start == 1) {
                System.out.println(S[end - 1]);
            }else{
                System.out.println(S[end - 1] - S[start - 1 - 1]);
            }
        }
    }
}