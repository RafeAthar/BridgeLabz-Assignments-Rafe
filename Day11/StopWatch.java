package array.assignment;

public class StopWatch {
    private long start = 0;
    private long stop = 0;

    public final void start() {
        start = System.currentTimeMillis();
    }

    public final void stop() {
        stop = System.currentTimeMillis();
    }

    public final long elapsedTime() {
        long difference;

        if (stop == 0) {
            long now = System.currentTimeMillis();

            difference = (now - start); // in millis
        } else {
            difference = (stop - start); // in millis
        }
        return difference;
    }

    public static void main(String[] args) {
        StopWatch sw = new StopWatch();

        sw.start();
        sw.stop();
        long elapsedTime = sw.elapsedTime();
        System.out.println("Elapsed Time in ms is: " + elapsedTime);
    }
}
