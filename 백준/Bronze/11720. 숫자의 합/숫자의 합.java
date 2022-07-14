import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String s = kb.next();
        int sum = 0;
        for(int i = 0 ; i < n ; i++){
            char c = s.charAt(i);
            int num = Character.getNumericValue(c);
            sum += num;
        }
        System.out.println(sum);
    }
}