package btvn;

public class Baitap1 {

    static boolean checkPrime(int a) {
        if (a <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean checkOddNum(int b) {
        return b % 2 != 0;
    }

    public static void main(String[] args) {
        int a = 11, b = 11;
        if (checkPrime(a) == true) {
            System.out.println("This is prime");
        } else {
            System.out.println("Not prime");
        }
        if (checkOddNum(b) == true) {
            System.out.println("This is oddNume");
        } else {
            System.out.println("Not oddNum");
        }
    }

}