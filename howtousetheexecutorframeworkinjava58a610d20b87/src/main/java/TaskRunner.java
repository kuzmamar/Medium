import java.util.Collection;
import java.util.concurrent.ExecutorService;

public class TaskRunner {

    private final ExecutorService executorService;

    public TaskRunner(ExecutorService executorService) {
        this.executorService = executorService;
    }

    public void run(Collection<Task> tasks) {
        tasks.forEach(executorService::execute);
        /* This will make the executor accept no new threads and finish all existing threads in the queue. */
        executorService.shutdown();
    }
}
