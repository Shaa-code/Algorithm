import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        int p1 = 1;
        int p2 = 1;
        int cnt = 1;
        int sum = 1;

        while(p2 != n){
            if(sum < n) {
                p2++;
                sum += p2;
            } else if ( sum == n ){
                cnt++;
                p2++;
                sum += p2;
            } else if ( sum > n){
                sum -= p1;
                p1++;
            }
        }
        System.out.println(cnt);
    }
}