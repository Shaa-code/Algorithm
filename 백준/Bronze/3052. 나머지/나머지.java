import java.util.HashSet;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        HashSet<Integer> h = new HashSet<>();

        for(int i = 0 ; i<10 ; i++){
           h.add(kb.nextInt() % 42);
        }
        System.out.println(h.size());
    }

}