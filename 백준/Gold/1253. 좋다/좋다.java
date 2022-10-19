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
        int[] A = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);

        int cnt = 0;

        for(int i = 0 ; i < n ; i++){

            int p1 = 0;
            int p2 = n-1;

            while(p1 != p2){
                if(A[p1] + A[p2] > A[i]){
                    p2--;
                } else if(A[p1] + A[p2] == A[i]){
                    if( i != p1 && i != p2) {
                        cnt++;
                        break;
                    } else if( i == p1){
                        p1++;
                    } else if (i == p2){
                        p2--;
                    }
                } else if(A[p1] + A[p2] < A[i]){
                    p1++;
                }
            }
        }
        System.out.println(cnt);
        br.close();
    }
}