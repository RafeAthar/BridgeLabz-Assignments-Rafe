package ds.assignment;

import java.util.Hashtable;
import java.util.Map;

public class HashTableFrequency {

    public static void main(String[] args) {

        String sentence = "to be or not to be or bee";

        Hashtable<String, Integer> freqTable = new Hashtable<>();

        for(String word: sentence.split(" ")){
            freqTable.put(word, freqTable.get(word)==null? 1: freqTable.get(word)+1);
        }

        System.out.println("Frequencies of words now: ");
        for (Map.Entry pair: freqTable.entrySet()){
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }

        freqTable.remove("bee");
        System.out.println("after removing word 'bee' ");
        for (Map.Entry pair: freqTable.entrySet()){
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }

    }
}
