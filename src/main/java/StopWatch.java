public class StopWatch {
    private long startTime, endTime;

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public StopWatch() {
    }

    public void start() {
        this.setStartTime(System.currentTimeMillis());
    }

    public void stop() {
        this.setEndTime(System.currentTimeMillis());
    }

    public long getElapsedTime() {
        long elapsedTime = this.getEndTime() - this.getStartTime();
        return elapsedTime;
    }
}

class test {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        randomArray(arr);
        System.out.println("Array list: ");
        showArray(arr);

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        sortArray(arr);

        stopWatch.stop();

        System.out.println("\nArray sort: ");
        showArray(arr);

        System.out.println("\nTime to solve: " + stopWatch.getElapsedTime());
    }

    private static void randomArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
    }

    private static void showArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i != 0 && i % 100 == 0) System.out.println();
            System.out.print(arr[i] + "\t");
        }
    }

    public static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}

