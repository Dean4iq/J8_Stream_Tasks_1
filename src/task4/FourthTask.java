package task4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


//Using Stream.iterate, make an infinite stream of random numbers — not by calling Math.random
// but by directly implementing a linear congruential generator. In such a generator, you start with
// x[0] = seed and then produce x[n + 1] = 1 (a x[n] + c) % m, for appropriate values of a, c, and m.
// You should implement a method with parameters a, c, m, and seed that yields a Stream<Long>.
// Try out a = 25214903917, c = 11, and m = 2^48.
public class FourthTask {
    public void prepateAndExecute() {
        long a = 25214903917L;
        int c = 11;
        int m = (int) Math.pow(2, 48);

        execute(a, c, m);
    }

    private void execute(long a, int c, int m) {
        List<Long> seedList = new ArrayList<>();

        seedList.add(6L);

        Stream.iterate(0, i -> i + 1).forEach(i -> {
            seedList.add((a * seedList.get(i) + c) % m);
            System.out.println(i + " | " + seedList.get(i));
        });
    }
}
