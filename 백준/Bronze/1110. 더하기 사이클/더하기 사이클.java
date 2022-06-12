import java.util.*;


class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int cnt = 0;
        int n = kb.nextInt();
        int tmp = n;
        int num=0;
        while(true) {
            tmp = tmp%10*10 + (tmp/10+tmp%10)%10;
            cnt++;
            if(n == tmp)
                break;
        }
        System.out.println(cnt);
    }
}
