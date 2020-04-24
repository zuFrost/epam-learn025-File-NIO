package com.zufrost.learn;

public class JumpCase {
    public static void main(String[] args) {
        /**
         * Реализовать функционал изменения регистра в вид лесенки.
         * Возвращаемый текст должен начинаться с прописного регистра.
         *
         * Например для строки "Load Up On Guns And Bring Your Friends"
         * метод вернет "lOaD Up oN GuNs aNd bRiNg yOuR FrIeNdS".
         */
        /*@Override
        public String toJumpCase(String text) {
            //строку в массив символов

            text.getBytes();
            //массив символов подвергнуть изменению, согласно условия
            //преобразовать массив символов в строку и вернуть в результат
            return null; //TODO
        }*/

        String text = "Load Up On Guns And Bring Your Friends";
        System.out.println(text);
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            //проверка на четность. четные в нижнем регистре, нечетные в верхнем
            if (i % 2 == 0) {       //четные в нижний регистр
                String tempSt = String.valueOf(chars[i]);
                tempSt = tempSt.toLowerCase();
                chars[i] = tempSt.toCharArray()[0];
            } else {                //нечетные в верхнем регистре
                String tempSt = String.valueOf(chars[i]);
                tempSt = tempSt.toUpperCase();
                chars[i] = tempSt.toCharArray()[0];
            }
        }
//        System.out.println(Z);
    }
}
