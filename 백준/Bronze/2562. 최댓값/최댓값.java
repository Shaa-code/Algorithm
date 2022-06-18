import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int idx = 0;
        Scanner kb = new Scanner(System.in);
        int[] arr = new int[9];

        for(int i = 0 ; i < 9 ; i++){
            arr[i] = kb.nextInt();
        }
        for(int i = 0 ; i < 9 ; i++){
            if(max < arr[i]) {
                max = arr[i];
                idx = i+1;
            }
        }
        System.out.println(max);
        System.out.println(idx);
    }
}
