//import java.util.Stack;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PostFixEquations {

    public static void calculatePostFixEquation(String equation) {

    Stack<Integer> s = new Stack<>(equation.length());
        Scanner scan = new Scanner(equation);

        while (scan.hasNext()){
            if (scan.hasNextInt()){
                s.push(scan.nextInt());
            }
            else {
                int num2 = s.pop();
                int num1 = s.pop();
                String op = scan.next();

                switch (op){
                    case "+" :s.push(num2+num1);
                        System.out.println(num2+num1);
                        break;
                    case "-" :s.push(num2-num1);
                        System.out.println(num2-num1);
                        break;
                    case "*" :s.push(num2*num1);
                        System.out.println(num2 * num1);
                        break;
                    case "/" :s.push(num2/num1);
                        System.out.println(num2/num1);
                        break;
                }

            }
        }
    }
    public static void main(String[] args) {
        calculatePostFixEquation("1 2 +  3 * 9 +");
    }

}

//                 int result=0;
//                switch (operator) {
//                    case '+':
//                        result=value1 + value2;
//                        System.out.println(result);
//                    case '-':
//                        result=value1 - value2;
//                        System.out.println(result);
//                    case '*':
//                        result=value1 * value2;
//                        System.out.println(result);
//                    case '/':
//                        result=value1 / value2;
//                        System.out.println(result);
//                }
//
//            }
////2 3 + 3* ---> ((2+3)*3)
//                s.pop();

//                if (equation.charAt(i) == '+' || equation.charAt(i) == '-' || equation.charAt(i) == '*' || equation.charAt(i) == '/' || equation.charAt(i) == '(' || equation.charAt(i) == ')'){
//                        s.push(equation.charAt(i));
//                }
//                    int res=0;
//                if (s.pop() == '+') {
//                    res=var1 + var2;
//                } else if (s.pop() == '-') {
//                    res=var1 - var2;
//                } else if (s.pop() == '*') {
//                    res=var1 * var2;
//                } else if (s.pop() == '/') {
//                    res=var1 / var2;
//                } else {
//                    System.out.println("Invalid Operation!");
//                }
//
////            }
//        Stack<String> s = new Stack<String>(equation.length());
//        StringTokenizer st = new StringTokenizer(equation," ",true);
//
//        while (st.hasMoreTokens()){
//        if (st.nextToken().equals("+") || st.nextToken().equals("-") || st.nextToken().equals("*") || st.nextToken().equals("/")){
//        s.push(st.nextToken());
//        }
//        else {
//        s.push(st.nextToken());
//        s.push(st.nextToken());
//        String oprator = s.pop();
//        String i = s.pop();
//        String j= s.pop();
////                int i = Integer.parseInt(s.pop());
////                int j = Integer.parseInt(s.pop());
//
//        int result=0;
//        switch (oprator) {
//        case "+":
//        result=Integer.parseInt(i)+ Integer.parseInt(j);
//        s.push(String.valueOf(result));
//        break;
//        case "-":
//        result=Integer.parseInt(i)+ Integer.parseInt(j);
//        s.push(String.valueOf(result));
//        break;
//        case "*":
//        result=Integer.parseInt(i)+ Integer.parseInt(j);
//        s.push(String.valueOf(result));
//        break;
//        case "/":
//        result=Integer.parseInt(i)+ Integer.parseInt(j);
//        s.push(String.valueOf(result));
//        break;
//        }
