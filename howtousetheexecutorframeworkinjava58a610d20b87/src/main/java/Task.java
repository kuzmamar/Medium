public class Task implements Runnable {

    private final String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        execute();
        execute();
        execute();
        System.out.println();
    }

    private void execute() {
        System.out.println("Executing task " + name + " with thread " + Thread.currentThread().getName());
    }

    @Override
    public String toString() {
        return this.name;
    }
}
