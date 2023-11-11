import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestIteration {

    public static void main(String[] args) {


                List<Integer> myList = new ArrayList<>();
                long startTime;
                long endTime;

                startTime = System.currentTimeMillis();
                for (int i = 0; i < 10000000; i++) {
                    myList.add(i);

                }
        endTime = System.currentTimeMillis();
        System.out.println("Add 10 M elements to list takes " + (endTime - startTime) + " msec ");

        startTime = System.currentTimeMillis();
        for (int i : myList) {
            int temp = i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("For each loop takes " + (endTime - startTime) + " msec ");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < myList.size(); i++) {
            myList.size();
        }
        endTime = System.currentTimeMillis();
        System.out.println("Classic for iteration + list size takes " + (endTime - startTime) + " msec ");


        startTime = System.currentTimeMillis();
        for (int i = 0; i < myList.size(); i++) {
            int temp = i;
            myList.size();
        }
        endTime = System.currentTimeMillis();
        System.out.println("Classic for iteration + list size + variable takes " + (endTime - startTime) + " msec ");


        startTime = System.currentTimeMillis();
        for (int i = myList.size(); i > 0; i--) {
            int temp = i;
            myList.size();
        }
        endTime = System.currentTimeMillis();
        System.out.println("For iteration backwards + list size + variable takes " + (endTime - startTime) + " msec ");


        startTime = System.currentTimeMillis();
        Iterator<Integer> iterator = myList.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            int temp = number;
            myList.size();
        }
        endTime = System.currentTimeMillis();
        System.out.println("Iteration with Iterator + list size + variable takes " + (endTime - startTime) + " msec ");


        startTime = System.currentTimeMillis();
        ListIterator<Integer> iterator2 = myList.listIterator();
                while (iterator2.hasNext()) {
                    Integer number = iterator2.next();
                    int temp = number;
                    myList.size();
        }
        endTime = System.currentTimeMillis();
        System.out.println("Iteration with ListIterator + list size + variable takes " + (endTime - startTime) + " msec ");
    }
}



