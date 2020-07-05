import java.util.Collection;
import java.util.concurrent.Executors;

public class SingleThreadPool {

    public static void main(String[] args) {
        Collection<Task> tasks = TaskFactory.create();
        TaskRunner taskRunner = new TaskRunner(Executors.newSingleThreadExecutor());
        taskRunner.run(tasks);
    }
}
