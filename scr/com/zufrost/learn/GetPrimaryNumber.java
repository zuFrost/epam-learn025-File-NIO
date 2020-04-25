package com.zufrost.learn;

import com.sun.org.apache.xpath.internal.objects.XBoolean;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class GetPrimaryNumber {
    public static void main(String[] args) {
        /**
         * Метод находит простое число по номеру
         *
         * @param range номер числа, считая с числа 2
         * @return простое число
         */
        /*@Override
        public BigInteger getPrimaryNumber(int range) {
            return null;
        }*/

//        System.out.println(Math.sqrt(9));
        System.out.println(getPrime(100));


    }
    public static BigInteger getPrime(int count) {
        List<Integer> primes = new ArrayList<>();
        if (count > 0) {
            primes.add(2);
        }
        for (int i = 3; primes.size() < count; i += 2) {
            if (isPrime(i, primes)) {
                primes.add(i);
            }
        }
        return BigInteger.valueOf(primes.get(count-1));
    }
    private static boolean isPrime(int n, List<Integer> primes) {
        double sqrt = Math.sqrt(n);
        for (int i = 0; i < primes.size(); i++) {
            int prime = primes.get(i);
            if (prime > sqrt) {
                return true;
            }
            if (n % prime == 0) {
                return false;
            }
        }
        return true;
    }

}
