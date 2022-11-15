import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int Acnt = 0;
        int Bcnt = 0;

        String str = br.readLine();
        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);
            switch (c) {
                case 'A':
                    Acnt++;
                    break;
                case 'B':
                    Bcnt++;
                    break;
            }
        }
        if (Acnt > Bcnt){System.out.println('A');}
        else if(Acnt == Bcnt){System.out.println("Tie");}
        else{ System.out.println('B');}
    }
}