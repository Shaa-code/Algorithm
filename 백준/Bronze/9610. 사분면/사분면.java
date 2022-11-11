import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int q1,q2,q3,q4,ax;
        q1 = q2 = q3 = q4 = ax = 0;
        while(n-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if( x > 0 && y > 0){
                q1++;
            }else if( x < 0 && y > 0){
                q2++;
            }else if( x < 0 && y < 0){
                q3++;
            }else if( x > 0 && y < 0){
                q4++;
            }else{
                ax++;
            }
        }
        System.out.println("Q1: "+ q1);
        System.out.println("Q2: "+ q2);
        System.out.println("Q3: "+ q3);
        System.out.println("Q4: "+ q4);
        System.out.println("AXIS: "+ ax);
    }
}