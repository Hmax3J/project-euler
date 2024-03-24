/*
    가장 큰 소인수 구하기.
    어떤 수를 소수의 곱으로만 나타내는 것을 소인수분해라 하고, 이 소수들을 그 수의 소인수라고 합니다.
    예를 들면 13195의 소인수는 5, 7, 13, 29 입니다.
    600851475143의 소인수 중에서 가장 큰 수를 구하세요.
 */
public class Problem3 {

    public static void main(String[] args) {
        long n = 600851475143L;

        while(!isPrime(n)) {
            for (long i = 1; i < n; i++) {
                if (isPrime(i) && n % i == 0) {
                    n /= i;
                }
            }
        }

        System.out.println(n);
    }

    private static boolean isPrime(long num) {
        if (num == 1 || num == 2) {
            return true;
        }

        for (long i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
