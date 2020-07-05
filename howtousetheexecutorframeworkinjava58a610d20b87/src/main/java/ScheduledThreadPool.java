import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class ScheduledThreadPool {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Current Time = " + new Date());
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(3);
        IntStream.range(0, 3).boxed().forEach((i) -> scheduleTask(executorService, new ScheduledTask("Task" + i)));
        Thread.sleep(6000); // Adding some delay
        executorService.shutdown();
    }

    private static void scheduleTask(ScheduledExecutorService executorService, ScheduledTask task) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        executorService.schedule(task, 3, TimeUnit.SECONDS);
    }
}
