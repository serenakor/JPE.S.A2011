public class SumAverageRunningInt {
    public static void main(String[] args) {
        int lowerbound = 1;
        int upperbound = 100;

        int sum = 0;
        for (int i = lowerbound; i <= upperbound; i++) {
            sum += i;
        }

        double average = (double) sum / (double) upperbound;

        System.out.println("Sum of the first 100 integers = " + sum);
        System.out.println("Average of the first 100 integers = " + average);
    }
}
