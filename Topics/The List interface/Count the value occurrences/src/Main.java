
import java.util.Collections;

class Counter {

    public static boolean checkTheSameNumberOfTimes(int elem, List<Integer> list1, List<Integer> list2) {
        int list1Frequency = Collections.frequency(list1, elem);
        int list2Frequency = Collections.frequency(list2, elem);
        return list1Frequency == list2Frequency;
    }
}