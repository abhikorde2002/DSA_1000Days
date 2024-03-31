package Stack_Queue;

import java.util.Stack;

public class Infix_Prifix {
    public static void main(String[] args) {
        String exp = "(p+q)*(m-n)";
        System.out.println("Infix expression: " + exp);
        System.out.println("Prefix expression: " + InfixtoPrifix(exp));
    }

    static int Prec(char ch){
        switch (ch) {
            case '+':
            case '-':
              return 1;
            case '*':
            case '/':
            return 2;

            case '^':
            return 3;
        }
        return -1;
    }

    static String InfixtoPrifix(String s){
        String str= "";
        Stack<Character> a= new Stack<>();

        for(int i=0;i<s.length();++i){
            char c=s.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                str+=c;
            }

            else if(c=='('){
                a.push(c);
            }

            else if (c == ')') {
                while (!a.isEmpty() &&
                  a.peek() != '('){
                  str += a.pop();
        
                  }
                a.pop();
              }

            else{
                while (!a.isEmpty() && Prec(c)<=Prec(a.peek())) {
                    str+=a.pop();
                }

                a.push(c);
            }
        }

        while (!a.isEmpty()) {
            if (a.peek()=='(') {
                return "Invalid Expression";
            }
            str+=a.pop();
        }
       return str;
    }

    static int Prec1(char ch) {
        switch (ch) {
        case '+':
        case '-':
          return 1;
    
        case '*':
        case '/':
          return 2;
    
        case '^':
          return 3;
        }
        return -1;
      }
    
      // The main method that converts
      // given infix expression
      // to postfix expression.
      static String infixToPostfix(String exp) {
        // initializing empty String for result
        String result = new String("");
    
        // initializing empty stack
        Stack < Character > stack = new Stack < > ();
    
        for (int i = 0; i < exp.length(); ++i) {
          char c = exp.charAt(i);
    
          // If the scanned character is an
          // operand, add it to output.
          if (Character.isLetterOrDigit(c))
            result += c;
    
          // If the scanned character is an '(',
          // push it to the stack.
          else if (c == '(')
            stack.push(c);
    
          // If the scanned character is an ')',
          // pop and output from the stack
          // until an '(' is encountered.
          else if (c == ')') {
            while (!stack.isEmpty() &&
              stack.peek() != '('){
              result += stack.pop();
    
              }
            stack.pop();
          } else // an operator is encountered
          {
            while (!stack.isEmpty() && Prec1(c) <=
              Prec1(stack.peek())) {
    
              result += stack.pop();
            }
            stack.push(c);
          }
    
        }
    
        // pop all the operators from the stack
        while (!stack.isEmpty()) {
          if (stack.peek() == '(')
            return "Invalid Expression";
          result += stack.pop();
        }
        return result;
      }
}
