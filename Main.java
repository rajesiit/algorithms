import java.util.Arrays;

public class Main {


    public char[] sentenceReversal(char[] sentence, int startIndex, int endIndex) {
        if(sentence == null || sentence.length < 2) {
            return new char[0];
        }
        while(startIndex < endIndex){
            char temp = sentence[startIndex];
            sentence[startIndex] = sentence[endIndex];
            sentence[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
            return sentence;
    }

    public char[] converToArray(String sentense){
        char[] charArray = new char[sentense.length()];
        int letterCount = 0;
        while (letterCount < sentense.length()) {
            charArray[letterCount] = sentense.charAt(letterCount);
            letterCount++;
        }
        return charArray;
    }

    public static void main(String[] args) {
        String sentense = "love is life";
        Main main = new Main();
        char[] charArray = main.converToArray(sentense);
        System.out.println("Input Sentence: " + Arrays.toString(charArray));
        charArray = main.sentenceReversal(charArray, 0, charArray.length -1);
        int start = 0;

        while(true){

            if(start >= charArray.length){
                break;
            }

            if(charArray[start] == ' '){
                start++;
            }

            int end = start + 1;

            while(end < charArray.length && charArray[end] != ' ' ){
                end++;
            }

            charArray = main.sentenceReversal(charArray, start, end - 1);

            start = end;

        }

        System.out.println("Output Sentence: " + Arrays.toString(charArray));

    }
}