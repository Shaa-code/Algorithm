class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
    }

    public int[] solution(int n) {
        int cnt = 0;
        int[] ch = new int[n+1]; // 배열을 모두 만들어둔다. 0,1은 무시. n+1까지해야 모두됨.
        for(int i = 2  ; i <= n ; i++){ 
            if(ch[i] == 0) // 배열이 0일때만
                cnt++;
                for(int j=i ; j<=n ; j=j+i) ch[j]=1;
        }
        return cnt;
    }
}
