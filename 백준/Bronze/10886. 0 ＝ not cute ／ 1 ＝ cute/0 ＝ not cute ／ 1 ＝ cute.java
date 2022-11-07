import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt1 = 0;
        int cnt2 = 0;
        for(int i = 0 ; i < n ; i++){
            char val = br.readLine().charAt(0);
            if(val == '1'){
                cnt1 += 1;
            }else if(val == '0'){
                cnt2 += 1;
            }
        }
        if(cnt1 > cnt2){
            System.out.println("Junhee is cute!");
        }else{
            System.out.println("Junhee is not cute!");
        }
    }
}

