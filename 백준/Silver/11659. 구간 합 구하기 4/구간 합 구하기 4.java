import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.valueOf(st.nextToken());
        int m = Integer.valueOf(st.nextToken());
        int[] A = new int[n+1];
        int[] S = new int[n+1];
        st = new StringTokenizer(br.readLine());
        for(int i = 1 ; i <= n ; i++){
            S[i] = S[i-1] + Integer.parseInt(st.nextToken());
        }

        for(int i = 1 ; i <= m ; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            System.out.println(S[end] - S[start-1]);
        }
    }
}
