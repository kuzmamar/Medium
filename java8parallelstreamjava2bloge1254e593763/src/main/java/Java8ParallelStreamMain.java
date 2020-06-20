import java.util.Arrays;
import java.util.stream.IntStream;

public class Java8ParallelStreamMain {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("=================================");
        System.out.println("Using Sequential Stream");
        System.out.println("=================================");
        printStream(Arrays.stream(array));

        System.out.println("=================================");
        System.out.println("Using Parallel Stream");
        System.out.println("=================================");
        printStream(Arrays.stream(array).parallel());
    }

    private static void printStream(IntStream stream) {
        stream.forEach(i -> System.out.println(i + " " + Thread.currentThread().getName()));
    }
}
