import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int d = Integer.parseInt(st.nextToken());

        c += d;

        while( c > 59 ){
            c -= 60;
            b++;
        }
        while( b > 59 ){
            b -= 60;
            a++;
        }
        while( a > 23 ){
            a -= 24;
        }

        System.out.println( a +" "+ b +" "+ c );
    }
}