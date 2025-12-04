package org.example.ArrayOrString;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TextJustification {
    public static void main(String[] args) {
        TextJustification textJustification = new TextJustification();
        List<String> result= textJustification.fullJustify(new String[]{"This", "is", "an", "example", "of", "text", "justification."}, 16);
    }
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result=new ArrayList<>();
        List<StringBuilder> currentWords= new ArrayList<>();
        int sumOfLengthOfCurrentWords=0;
        for(String word:words){
            int newLineLength=sumOfLengthOfCurrentWords+word.length()+currentWords.size();
            if(newLineLength>maxWidth){
                int extraPadding = maxWidth - (sumOfLengthOfCurrentWords + currentWords.size()-1);
                int wordsToRoundRobinInSpaces=Math.max(currentWords.size()-1, 1);
                for(int i=0; i<extraPadding; i++){
                    int indexForSpace= i% wordsToRoundRobinInSpaces;
                    currentWords.get(indexForSpace).append(" ");
                }
                result.add(currentWords.stream().map(sb->sb.toString()).collect(Collectors.joining(" ")));
                currentWords = new ArrayList<>();
                sumOfLengthOfCurrentWords =0;
            }

            currentWords.add(new StringBuilder(word));
            sumOfLengthOfCurrentWords += word.length();

        }
        int extraSpaces=maxWidth-(sumOfLengthOfCurrentWords+currentWords.size()-1);
        String spaces= Stream.generate(()->" ").limit(extraSpaces).collect(Collectors.joining(""));
        result.add(
                currentWords.stream().map(sb->sb.toString()).collect(Collectors.joining(" ")) + spaces);
        return result;

    }
}
