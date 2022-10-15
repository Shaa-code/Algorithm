import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        double[] arr = new double[n];
        double max = 0;
        double sum = 0;

        for(int i = 0 ; i < n ; i++){
            arr[i] = kb.nextInt();
            if(max < arr[i])
                max = arr[i];
        }

        for(int i = 0 ; i < n ; i++) {
            sum += (arr[i] / max * 100)/n;
        }
        System.out.println(sum);
    }
}
