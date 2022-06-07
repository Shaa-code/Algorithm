import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int i=1;
        while(i<=n){
            int j=0;
            while(j<i) {
                System.out.print('*');
                j++;
            }
            i++;
            System.out.println();
        }
    }
}