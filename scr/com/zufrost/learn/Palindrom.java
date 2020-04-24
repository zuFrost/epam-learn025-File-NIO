package com.zufrost.learn;

public class Palindrom {
    public static void main(String[] args) {
        /**
         * Метод определяет, является ли строка палиндромом.
         * <p>
         * Палиндром - строка, которая одинаково читается слева направо и справа налево.
         * <p>
         * Например для строки "а роза упала на лапу Азора" вернется true, а для "я не палиндром" false
         */
        /*@Override
        public boolean isPalindrome(String string) {
            return false; //TODO
        }*/

        String text1 = "а роза упала на лапу Азора";
        String text2 = "я не палиндром";

//        char[]
        StringBuffer buffer = new StringBuffer(text1);
        buffer.reverse();
        String text1Temp = buffer.toString();
//        System.out.println(text1);
//        System.out.println(text1Temp);
        text1 = text1.replaceAll(" ", "").toLowerCase();
        text1Temp = text1Temp.replaceAll(" ", "").toLowerCase();
        System.out.println(text1);
        System.out.println(text1Temp);
        System.out.println(text1.equals(text1Temp));


    }
}
