public class ClassAverage {

    public static double calculateClassAverage(double a, double b) {
        return (a + b) / 2;
    }

    public static double calculateClassAverage(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public static double calculateClassAverage(double[] scores) {
        double sum = 0;
        for (double s : scores) {
            sum += s;
        }
        return sum / scores.length;
    }

    public static void main(String[] args) {
        System.out.println(calculateClassAverage(70, 80));
        System.out.println(calculateClassAverage(60, 70, 80));

        double[] marks = {65, 75, 85, 90};
        System.out.println(calculateClassAverage(marks));
    }
}

