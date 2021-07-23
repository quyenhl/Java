package Task;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 Create a set of numbers (Set<Integer>) and add 10 different numbers to it.

 Remove from the set all numbers greater than 10 .

 Requirements:
 •Create createSet() method to create and return a HashSet containing 10 different numbers.
 •Create removeAllNumbersGreaterThan10() method to remove from the set all numbers greater than 10.
 •Write unit test for the removeAllNumbersGreaterThan10() method
 */
public class Task5 {

    public  Set<Integer> createSet() {

        HashSet<Integer> hashSet = new HashSet<>();
        for (int i=0; i<15; i++) {
            hashSet.add(i + 1);
        }
        return hashSet;


    }
    public Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> hashSet) {
        Iterator<Integer> iterator = hashSet.iterator();
        while (iterator.hasNext())
            if (iterator.next()>10)
                iterator.remove();
        return hashSet;
    }

}
