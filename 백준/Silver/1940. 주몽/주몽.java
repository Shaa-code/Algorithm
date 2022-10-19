import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] A = new int[n];
        for( int i = 0; i < n ; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A); // O(nlogn)

        int p1 = 0;
        int p2 = n-1;
        int cnt = 0;
        while(p1 < p2){ // O(n)
            if(A[p1] + A[p2] < m) {
                p1++;
            } else if(A[p1] + A[p2] == m){
                cnt++;
                p1++;
                p2--;
            } else{
                p2--;
            }
        }

        System.out.println(cnt);
        br.close();
    }
}