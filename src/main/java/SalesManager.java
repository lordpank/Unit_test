public class SalesManager {

    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long average() {
        long min = sales[0];
        long max = sales[0];
        long averageValue = 0;
        long sum = 0;

        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            } else if (sale < min) {
                min = sale;
            }
            sum = sum + sale;
        }
        averageValue = (sum - min - max) / (sales.length - 2);
        return averageValue;

    }

}