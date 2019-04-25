package task5;

import java.util.*;
import java.util.stream.*;


//Write a method public static <T> Stream<T> zip(Stream<T> first, Stream<T> second)
// that alternates elements from the stream first and second, stopping when one of them runs out of elements
public class FifthTask {
    public void prepareAndExecute() {
        List<String> firstList = new ArrayList<>();
        List<String> secondList = new ArrayList<>();

        firstList.add("F1");
        firstList.add("F2");
        firstList.add("F3");
        firstList.add("F4");
        firstList.add("F5");

        secondList.add("S1");
        secondList.add("S2");
        secondList.add("S3");
        secondList.add("S4");
        secondList.add("S5");
        secondList.add("S6");
        secondList.add("S7");

        zip(firstList.stream(), secondList.stream()).forEach(System.out::println);
    }

    private static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> iteratorForFirst = first.iterator();
        Iterator<T> iteratorForSecond = second.iterator();

        List<T> listOfItems = new ArrayList<>();

        IntStream.iterate(0, i -> i++)
                .peek(i -> {
                    if (iteratorForFirst.hasNext() && iteratorForSecond.hasNext()) {
                        listOfItems.add(iteratorForFirst.next());
                        listOfItems.add(iteratorForSecond.next());
                    }
                })
                .allMatch(i -> iteratorForFirst.hasNext() && iteratorForSecond.hasNext());

        return listOfItems.stream();
    }
}
