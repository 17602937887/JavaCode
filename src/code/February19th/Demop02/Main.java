package code.February19th.Demop02;

import javafx.util.Pair;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pair<Integer, Integer>> a = new ArrayList<>();
        Stack<Pair<String, Integer>> stack = new Stack<>();
        String s = scanner.next();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push(new Pair<String, Integer>("(", i + 1));
            } else {
                if(!stack.empty() && stack.peek().getKey().equals("(")){
                    a.add(new Pair<Integer, Integer>(stack.peek().getValue(), i + 1));
                    stack.pop();
                } else {
                    System.out.println("No");
                    return ;
                }
            }
        }
        if(stack.empty()){
            System.out.println("Yes");
            for(int i = 0; i < a.size(); i++){
                System.out.println(a.get(i).getKey() + " " + a.get(i).getValue());
            }
        } else{
            System.out.println("No");
        }
    }
}
