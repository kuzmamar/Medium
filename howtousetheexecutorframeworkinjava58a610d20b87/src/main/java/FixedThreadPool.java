import java.util.Collection;
import java.util.concurrent.Executors;

public class FixedThreadPool {

    public static void main(String[] args) {
        Collection<Task> tasks = TaskFactory.create();
        TaskRunner taskRunner = new TaskRunner(Executors.newFixedThreadPool(3));
        taskRunner.run(tasks);
    }
}
