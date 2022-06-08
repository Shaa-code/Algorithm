import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        for(int i = 1; i<=n ; i++) {
            for(int j=0 ;j<n-i; j++)
                System.out.printf(" ");
            for(int k=0 ;k<i;k++)
                System.out.printf("*");
            System.out.println();
        }
    }
}