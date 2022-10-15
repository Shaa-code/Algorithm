import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        // str -> char[] 로 바꾸고 배열을 탐색하며 sum에 += 1을 해준다.
        char[] str = kb.next().toCharArray();
        int sum = 0;
        for(int i = 0; i < n ; i++){
            sum += str[i] - 48;
        }
        System.out.println(sum);
    }
}
