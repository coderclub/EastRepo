package mentoring083118;

import java.util.Stack;

public class UseOfStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("NY");
        stack.push("NJ");
        stack.push("CT");
        stack.push("NH");
        stack.push("NY");

        //System.out.println(stack.peek());
        /*if (stack.peek().equalsIgnoreCase("NH")){
            System.out.println(stack.pop());
        }*/

        /*System.out.println("IS NY IN THE STACK " +stack.search("NY"));
        System.out.println("IS NY IN THE STACK " +stack.search("WA"));*/

        System.out.println("the element at the top is: " +stack.peek());
    }
}
