import java.util.*;
class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int i = 0;
        int sum = 0;
        while(i <= n){
            sum += i;
            i++;
        }
        System.out.println(sum);


    }
}
