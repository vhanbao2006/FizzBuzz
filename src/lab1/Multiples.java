package lab1;

public class Multiples {
    public static void countMultiples() {

//        int count = multiples();
//        System.out.println(count);

    }

    public static int multiples(int n, int a, int b) {
        int i = 1;
        int count = 0;
        while (i < n) {
            if (i % a == 0 || i % b == 0) {
                count++;
            }
            i++;
        }
        return count;
    }
}
