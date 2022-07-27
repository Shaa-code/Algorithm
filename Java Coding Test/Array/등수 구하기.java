import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        int[] nArr = new int[n];
        for(int i = 0 ; i < n ; i++) {
            arr[i] = kb.nextInt();
        }
        Main T = new Main();
        T.solution(n,arr,nArr);
    }
    public void solution(int n,int[] arr, int[] nArr){
        for(int i = 0 ; i < n ; i++){
            int cnt = 1;
            for(int j = 0 ; j < n ; j++){
                if(arr[j] > arr[i]){
                    cnt++;
                }
            }
            nArr[i] = cnt;
        }
        for(int i = 0 ; i < nArr.length ; i++)
        System.out.print(nArr[i]+" ");
    }
}
