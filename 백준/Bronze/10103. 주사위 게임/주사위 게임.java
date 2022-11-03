import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int retA = 100;
        int retB = 100;
        for( int i = 0 ; i < n ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if ( a > b ){
                retA -= a;
            } else if (a == b){
                continue;
            } else {
                retB -= b;
            }
        }
        System.out.println(retB);
        System.out.println(retA);
    }
}