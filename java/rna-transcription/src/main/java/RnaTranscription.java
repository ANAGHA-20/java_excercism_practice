import java.util.HashMap;
import java.util.Map;


class RnaTranscription {

    String transcribe(String dnaStrand) {
        if(dnaStrand.isEmpty()){
            return "";
        }
        else{
            Map<Character, Character> charMap = new HashMap<>();
            char charToAppend;
        
            charMap.put('G', 'C');
            charMap.put('C', 'G');
            charMap.put('T', 'A');
            charMap.put('A', 'U');

            StringBuilder rna = new StringBuilder();
            char[] charArray = dnaStrand.toCharArray();
            for (char c : charArray) {
                charToAppend = charMap.get(c);
                rna.append(charToAppend);
            }       
            return rna.toString();
        }
    }
}
