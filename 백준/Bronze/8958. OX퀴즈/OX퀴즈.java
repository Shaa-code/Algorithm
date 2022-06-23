import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int cnt = 0;
        int sum = 0;
        for(int i = 0 ; i < n ; i++) {
            for (char x : kb.next().toCharArray()) {
                if (x == 'O') {
                    cnt++;
                    sum += cnt;
                }else{
                    cnt = 0;
                }
            }
            cnt = 0;
            System.out.println(sum);
            sum = 0;
        }
    }
}