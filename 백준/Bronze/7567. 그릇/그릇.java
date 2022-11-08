import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] arg) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str = br.readLine().toCharArray();
        int len = 10;
        for(int i = 1 ; i < str.length; i++){
            if(str[i-1] != str[i]){
                len += 10;
            }else if(str[i-1] == str[i]){
                len += 5;
            }
        }
        System.out.println(len);
    }
}