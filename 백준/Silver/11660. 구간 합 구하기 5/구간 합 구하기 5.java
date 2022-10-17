import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] A = new int[n+1][n+1];
        int[][] S = new int[n+1][n+1];

        for(int i = 1 ; i <= n ; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                S[i][j] = S[i - 1][j] + S[i][j - 1] - S[i - 1][j - 1] + Integer.parseInt(st.nextToken());
            }
        }

        for(int q = 0 ; q < m ; q++){

            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int x_ = Integer.parseInt(st.nextToken());
            int y_ = Integer.parseInt(st.nextToken());
            int sum = 0;

            sum = S[x_][y_]-S[x_][y-1]-S[x-1][y_]+S[x-1][y-1];
            System.out.println(sum);
        }
    }
}