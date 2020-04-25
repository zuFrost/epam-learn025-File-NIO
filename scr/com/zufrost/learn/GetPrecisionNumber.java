package com.zufrost.learn;

import java.math.BigDecimal;

public class GetPrecisionNumber {
    public static void main(String[] args) {
        /**
         * Метод делит первое число на второе с заданной точностью
         * Например 1/3 с точностью 2 = 0.33
         * @param range точность
         * @return результат
         */
        /*@Override
        public BigDecimal getPrecisionNumber(int a, int b, int range) {
            return null;
        }*/

        //BigDecimal     divide(BigDecimal divisor, int roundingMode) — деление.
        // Количество знаков после запятой у возвращаемого значения this.scale().
        //BigDecimal     divide(BigDecimal divisor, int scale, Rounding roundingMode) — деление.
        // Возвращает BigDecimal, значение которого равно this/divisor, количество знаков после запятой равно scale.
        int a = 1;
        int b = 3;
        int range = 2;
        BigDecimal bigDecimal = BigDecimal.valueOf(a).divide(BigDecimal.valueOf(b), range, BigDecimal.ROUND_HALF_UP);
        System.out.println(bigDecimal);

    }
}
