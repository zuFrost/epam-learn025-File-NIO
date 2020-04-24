package com.zufrost.learn;

public class ConcatString {
    public static void main(String[] args) {
        /**
         * Реализовать функционал соединения переданных строк.
         * <p>
         * Например для параметров {"Smells", " ", "Like", " ", "Teen", " ", "Spirit"}
         * метод вернет "Smells Like Teen Spirit"
         */
        ConcatString cs = new ConcatString();
        System.out.println(cs.concatenate("Smells", " ", "Like", " ", "Teen", " ", "Spirit"));



    }
    public String concatenate(String ... elements) {
        String resultString = "";
        if (elements.length > 0) {
            System.out.println("количество принятых параметров " + elements.length);
            for (String element : elements) {
                System.out.print(resultString + " + " + element + " = ");
                resultString = resultString.concat(element);
                System.out.println(resultString);
            }
            return resultString;
        } else {
            return null;
        }

    }
}


