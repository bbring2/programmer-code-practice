package doitBook.search;

public class BMoore {

    static int bmMatch(String text, String pattern) {
        int textPointer;
        int patterPointer;
        int textLength = text.length();
        int patternLength = pattern.length();
        int[] skip = new int[Character.MAX_VALUE+1]; //건너뛰기 표

        //건너뛰기
        for(textPointer=0; textPointer<=Character.MAX_VALUE; textPointer++) {
            skip[textPointer] = patternLength;
        }
        for(textPointer=0; textPointer<patternLength-1; textPointer++) {
            skip[pattern.charAt(textPointer)] = patternLength - textPointer - 1;
        }

        //검색
        while(textPointer < textLength) {
            patterPointer = patternLength - 1;

            while(text.charAt(textPointer) == pattern.charAt(patterPointer)) {
                if(patterPointer == 0)
                    return textPointer;

                patterPointer--;
                textPointer--;
            }

            textPointer += Math.max(skip[text.charAt(textPointer)], patternLength - patterPointer);
        }

        return -1;
    }
}
