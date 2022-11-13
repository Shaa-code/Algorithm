import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] coordinate1 = new int[]{Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        st = new StringTokenizer(br.readLine());
        int[] coordinate2 = new int[]{Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        st = new StringTokenizer(br.readLine());
        int[] coordinate3 = new int[]{Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        
        int x,y;

        if(coordinate1[0] == coordinate2[0]){
            x = coordinate3[0];
        }else if(coordinate1[0] == coordinate3[0]){
            x = coordinate2[0];
        }else{
            x = coordinate1[0];
        }

        if(coordinate1[1] == coordinate2[1]){
            y = coordinate3[1];
        }else if(coordinate1[1] == coordinate3[1]){
            y = coordinate2[1];
        }else{
            y = coordinate1[1];
        }

        System.out.println(x + " " + y);
    }
}
