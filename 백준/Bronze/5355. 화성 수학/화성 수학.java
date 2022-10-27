import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < n ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            double num = Double.parseDouble(st.nextToken());

            for(int j = 0 ; j < 3 ; j++){
                try {
                    String sym = st.nextToken();
                    switch (sym) {
                        case "@":
                            num *= 3;
                            break;
                        case "%":
                            num += 5;
                            break;
                        case "#":
                            num -= 7;
                            break;
                    }
                } catch (NoSuchElementException e){
                    break;
                }
            }
            System.out.printf("%.2f\n",num);
        }
    }
}
