import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PerformanceComparisonMain {

    public static void main(String[] args) {
        List<Integer> data = IntStream.rangeClosed(1, 100_000).boxed().collect(Collectors.toList());
        System.out.println("==== Measuring sequential computation ====");
        measure(data.stream());

        System.out.println("\n==== Measuring parallel computation ====");
        measure(data.stream().parallel());
    }


    private static int performComputation(int num) {
        int sum = 0;

        for (int i = 1; i < 1_000_000; i++) {
            int div = num / i;
            sum += div;
        }

        return sum;
    }


    private static void measure(Stream<Integer> stream) {
        long startTime = System.currentTimeMillis();
        long sum = stream.map(i -> (int) Math.sqrt(i))
                .map(PerformanceComparisonMain::performComputation)
                .reduce(0, Integer::sum);

        System.out.println(sum);
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken to complete: " + (endTime - startTime) / (1000 * 60) + " minutes.");
    }
}
