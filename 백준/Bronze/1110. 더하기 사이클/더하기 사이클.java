import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = 0;
        int n = Integer.parseInt(br.readLine());
        int tmp = n;
        while(true) {
            tmp = tmp%10*10 + (tmp/10+tmp%10)%10;
            cnt++;
            if(n == tmp)
                break;
        }
        System.out.println(cnt);
    }
}

