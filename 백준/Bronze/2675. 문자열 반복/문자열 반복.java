import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0 ; i < n ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            char[] s = st.nextToken().toCharArray();
            for(int j = 0; j < s.length ; j++){
                for(int k = 0; k < r; k++) {
                    sb.append(s[j]);
                }
            }
            System.out.println(sb);
            sb.delete(0,sb.length());
        }
    }
}
