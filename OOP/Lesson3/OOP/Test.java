package OOP;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(12);
        nums.add(123);
        nums.add(1234);

        // Iterator<Integer> iter = nums.iterator();
        // while(iter.hasNext()){
        //     System.out.println(iter.next());
        // }
        Worker worker = new Worker("Имя","Фамилия" , 18, 4567);

        Iterator<String> component = worker;
        while (component.hasNext()) {
            System.out.println(worker.next());
        }
    }
}
