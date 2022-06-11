import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        while(true){
            int a = kb.nextInt();
            int b = kb.nextInt();
            if(a == 0 && b == 0)
                break;
            System.out.println(a+b);
        }
    }
}