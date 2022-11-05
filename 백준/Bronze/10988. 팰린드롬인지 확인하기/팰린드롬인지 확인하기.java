import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        boolean flag = false;
        for(int i = 0 ; i < str.length()/2 ; i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                flag = true;
                break;
            }
        }
        if(flag == true){
            System.out.println(0);
        } else{
            System.out.println(1);
        }
    }
}

