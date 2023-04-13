package homework.hw4;


import java.util.Scanner;
import java.util.Stack;

public class Task3 {

//Дана строка содержащая только символы '(', ')', '{', '}', '[' и ']', определите,
// является ли входная строка логически правильной.
// Входная строка логически правильная, если:
// 1) Открытые скобки должны быть закрыты скобками того же типа.
// 2) Открытые скобки должны быть закрыты в правильном порядке. Каждая закрывающая скобка имеет соответствующую
// открытую скобку того же типа.
// ()[] = true
// () = true
// {[()]} = true
// ()() = true
// )()( = false

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Введите строку, содержащую только символы '(',')',  '{','}', '['и']': ");
    
    String input = sc.nextLine();
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < input.length(); i++) {
        char c = input.charAt(i);
        if(c == '(' || c == '{' || c == '['){
            stack.push(c);
        } else if ( c == ')' && !stack.isEmpty() && stack.peek() == '('){
            stack.pop();
        } else if ( c == '}' && !stack.isEmpty() && stack.peek() == '{'){
            stack.pop();
        
        } else if ( c == ']' && !stack.isEmpty() && stack.peek() == '['){
            stack.pop();
        } else {
            System.out.println(" строка введена не правильно");
            return;
        }
    }
    if (stack.isEmpty()){
        System.out.println("Введенная строка правильная");
    } else {
        System.out.println("Введенная строка неправильная");
    }

}
}

