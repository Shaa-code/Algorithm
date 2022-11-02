import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for( int i = 0 ; i < t ; i++){
            int n = Integer.parseInt(br.readLine());
            String ret = "";
            int max = Integer.MIN_VALUE;
            for( int j = 0 ; j < n ; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String title = st.nextToken();
                int consume = Integer.parseInt(st.nextToken());
                if( consume > max ){
                    max = consume;
                    ret = title;
                }
            }
            System.out.println(ret);
        }
    }
}