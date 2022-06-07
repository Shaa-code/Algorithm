import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int t = kb.nextInt();
        int i = 0;
        while(i<t) {
            i++;
            int m = kb.nextInt();
            int n = kb.nextInt();
            //Case #1: 1 + 1 = 2
            System.out.println(String.format("Case #%d: %d + %d = %d",i,m,n,m+n));
        }
    }
}