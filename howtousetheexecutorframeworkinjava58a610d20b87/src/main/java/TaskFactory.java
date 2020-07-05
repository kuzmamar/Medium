import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TaskFactory {

    private TaskFactory() {

    }

    public static Collection<Task> create() {
        return IntStream
                .range(0, 5)
                .boxed()
                .map((i) -> new Task("Task" + i))
                .collect(Collectors.toList());
    }
}
