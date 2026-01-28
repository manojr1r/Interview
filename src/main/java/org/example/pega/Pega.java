package org.example.pega;

public class Pega {
    static void main(String[] args) {

//        System.out.println(correctSentence("Pega123Systems456India"));
        System.out.println(correctSentenceRegex("Pega123Systems456India"));

    }

    public static String correctSentenceRegex(String rawString) {
        return rawString.replaceAll("\\d+", " ");
    }

    public static StringBuffer correctSentence(String rawString) {
        StringBuffer correctSentence = new StringBuffer();
        boolean isNumber = false;

        char[] ar = rawString.toCharArray();

        for (Character a : ar) {
            if (Character.isAlphabetic(a)) {
                correctSentence.append(a);
                isNumber = false;
            }
            if (Character.isDigit(a)) {
                if(!isNumber){
                    correctSentence.append(" ");
                    isNumber = true;
                }
            }
        }

        return correctSentence;
    }
}
