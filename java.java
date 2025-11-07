
public class Main {
    public static int digitSum(int n) {
        n = Math.abs(n);
        if (n == 0)
            return 0;
        return (n % 10) + digitSum(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(digitSum(123));   // 6
        System.out.println(digitSum(-456));  // 15
    }
}

#вывод
#6
#15
