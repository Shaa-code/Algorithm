import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] A = new int[3];
        for(int i = 0 ; i < 3 ; i++) {
             A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);
        System.out.println(A[1]);
    }
}
