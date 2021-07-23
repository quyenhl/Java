import Task.Task5;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Task5Test {
    @Test
    public void Task5Test(){
        Task5 task5 = new Task5();
        Set<Integer> initSet = task5.createSet();
        System.out.print("List original numbers: ");
        for (int i=0; i<15; i++) {
            System.out.print(i + ",");
        }

        System.out.println();

        Set<Integer> actual = task5.removeAllNumbersGreaterThan10(initSet);
        System.out.print("Actual result: ");
        Iterator<Integer> iterator2 = actual.iterator();
        while (iterator2.hasNext())
            System.out.print(iterator2.next() + ",");
        System.out.println();

        Set<Integer> expectResult = removeAllNumbersGreaterThan10(initSet);
        System.out.print("Expected result: ");
        Iterator<Integer> iterator3 = expectResult.iterator();
        while (iterator3.hasNext())
            System.out.print(iterator3.next() + ",");
        System.out.println();

        Assert.assertEquals(actual, expectResult);

    }
    private Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext())
            if (iterator.next()>10)
                iterator.remove();
        return set;
    }
}