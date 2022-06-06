import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int i = 1;
        while(i<=n){
            System.out.println(i);
            i++;
        }
}
}

