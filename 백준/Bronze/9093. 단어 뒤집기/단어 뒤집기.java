import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while(n-- > 0){
            String[] arr = br.readLine().split(" ");
            StringBuilder sb = new StringBuilder();
            for(int i = 0 ; i < arr.length ; i++){
                char[] str = arr[i].toCharArray();
                for(int j = 0 ; j < str.length/2 ; j++) {
                    char tmp = str[j];
                    str[j] = str[str.length-j-1];
                    str[str.length-j-1] = tmp;
                }
                sb.append(String.valueOf(str)+" ");
            }
            System.out.println(sb);
        }
    }
}