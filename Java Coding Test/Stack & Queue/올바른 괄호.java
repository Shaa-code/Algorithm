class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }


public String solution(String str) {
    String ret = "YES";
    Stack<Character> stack = new Stack<>();
    for(char c : str.toCharArray()){
        if( c == '(' ) stack.push(c);
            else {
                if(stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
    if(!stack.isEmpty()) return "NO";
    return ret;
    }
}
