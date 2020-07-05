import java.util.Collection;
import java.util.concurrent.Executors;

public class CachedThreadPool {

    public static void main(String[] args) {
        Collection<Task> tasks = TaskFactory.create();
        TaskRunner taskRunner = new TaskRunner(Executors.newCachedThreadPool());
        taskRunner.run(tasks);
    }
}
