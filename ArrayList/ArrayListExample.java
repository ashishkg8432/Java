package ArrayList;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(4);
        list.add(5);
        list.remove(0);
        list.set(0,10);
        System.out.println(list.contains(1));


    }

}
