package com.zufrost.learn;

public class RemoveString {
    public static void main(String[] args) {
        /**
         * Реализовать функционал удаления строки из другой строки.
         *
         * Например для базовой строки "Hello, hello, hello, how low?" и строки для удаления ", he"
         * метод вернет "Hellollollo, how low?"
         *
         * @param base - базовая строка с текстом
         * @param remove - строка которую необходимо удалить
         */
        /*@Override
        public String removeString(String base, String remove) {
            return null; //TODO
        }*/

        String string = "Hello, hello, hello, how low?";
        String stringToDelete = ", he";
        System.out.println(string);
        string = string.replaceAll(stringToDelete, "");
//        string = string.

        System.out.println(string);


    }
}
