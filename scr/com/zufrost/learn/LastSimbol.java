package com.zufrost.learn;

public class LastSimbol {
    public static void main(String[] args) {
        /**
         * Реализовать функционал проверки на то, что строка заканчивается знаком вопроса.
         *
         * Например для строки "Hello, hello, hello, how low?" метод вернет true
         * Например для строки "Hello, hello, hello!" метод вернет false
         */
        /*@Override
        public boolean isQuestionString(String text) {
            return false; //TODO
        }*/

        String text1 = "Hello, hello, hello, how low?";
        String text2 = "Hello, hello, hello!";

        System.out.println(text2.charAt(text2.length() - 1));
        if ((text2.charAt(text2.length() - 1)) == '?') {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
