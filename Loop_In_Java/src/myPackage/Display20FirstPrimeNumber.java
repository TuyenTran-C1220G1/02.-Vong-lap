package myPackage;

public class Display20FirstPrimeNumber {
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        } else for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        for (int i = 0; i < 100; i++) {
//            if (isPrime(i)) {
//                System.out.println(i);
//            }
//        }
        int count = 0;
        int number = 2;
        while (count < 7) {
            if (isPrime(number)) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
}
