public class SumDigits {
    public static int sum_digits(int n) {
        if (n < 10) {
            return n;
        }
        return (n % 10) + sum_digits(n / 10);
    }

    public static void main(String[] args) {
        int number = 123;
        System.out.println("Sum of digits: " + sum_digits(number));
    }
}
