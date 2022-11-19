import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int A,B,C;
        A = B = C = 0;

        while( n >= 300 ){
            A++;
            n -= 300;
        }

        while( n >= 60 ){
            B++;
            n -= 60;
        }

        while( n >= 10){
            C++;
            n -= 10;
        }

        if(n != 0){
            System.out.println(-1);
        }else{
            System.out.println(A + " " + B + " " + C);
        }
    }
}