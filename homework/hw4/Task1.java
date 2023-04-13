package homework.hw4;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
/*Task_3
public class Task_3 {
    // Дан Deque состоящий из последовательности цифр.
// Необходимо проверить, что последовательность цифр является палиндромом
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1,2,3,4,5,6));
    }
    public boolean checkOn(Deque<Integer> deque){
        return false;
    }
}
 */
public class Task1 {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1,2,3,4,5,6));

        boolean res = true;
        for (int i = 0; i < deque.size(); i++) {
            int f = deque.pollFirst();
            int l = deque.pollLast();
            if (f != l){
                res = false;
                break;
            }

        }
        System.out.println(res ? "Плиндром" : "Не полиндром");
    }
}


    

