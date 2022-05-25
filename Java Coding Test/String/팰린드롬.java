class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.print(T.solution(str));
    }

    static String solution(String str){
        String ret = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]","");
        System.out.println(str);
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equals(tmp)) ret = "YES";
        return ret;
    }
}
