import java.util.Date;

public class ScheduledTask implements Runnable {

    private final String name;

    public ScheduledTask(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        String thread = Thread.currentThread().getName();

        System.out.println(thread + " Start Time for Task " + name + " " + new Date());

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(thread + " End Time for Task " + name + " " + new Date());
    }

    @Override
    public String toString() {
        return this.name;
    }
}
