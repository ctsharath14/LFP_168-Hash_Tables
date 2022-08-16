import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class MyMapNode {

    /* Ability to find frequency
     *	of words in a sentence
     *	like “To be or not to be” */
    public void frequencyWord() {
        String sentence = "To be or not to be";
        System.out.println("The sentence : "+sentence);
        System.out.println("\n----------------- The frequency of words -----------------");
        String result = "";
        String[] words = sentence.toLowerCase().split(" ");
        MyHashMap<String, Integer> hashMap = new MyHashMap<>();
        for (String word : words) {
            Integer value = hashMap.get(word);
            if (value == null) {
                value = 1;
            } else {
                value += 1;
            }
            hashMap.add(word, value);
        }

        LinkedHashSet<String> set = new LinkedHashSet<String>(Arrays.asList(words));
        for (String word : set) {
            result = result + word + " : " + hashMap.get(word) + "\n";
        }
        System.out.println(result);
    }

    /* Ability to find frequency
     *	of words in a give large paragraph
     *	using hashmap to find index of words
     *	*/
    public void findWordFrequencyLargeParagraph() {
        String sentence = "Paranoids are not paranoid because they are paranoid but "
                + "because they keep putting themselves deliberately into paranoid "
                + "avoidable situations";
        System.out.println("The sentence : "+sentence);
        System.out.println("\n----------------- The frequency of words -----------------");
        String[] words = sentence.toLowerCase().split(" ");
        String result = "";
        MyHashMap<String, Integer> hashMap = new MyHashMap<>();
        for (String word : words) {
            Integer value = hashMap.get(word);
            if (value == null) {
                value = 1;
            } else {
                value += 1;
            }
            hashMap.add(word, value);
        }

        LinkedHashSet<String> set = new LinkedHashSet<String>(Arrays.asList(words));
        for (String word : set) {
            result = result + word + " : " + hashMap.get(word) + "\n";
        }
        System.out.println(result);

    }

    /* Ability to remove word "avoidable" &  find frequency
     *	of words in a give large paragraph
     *	using hashmap to find index of words */
    public void removeWordAvoidable() {
        String sentence = "Paranoids are not paranoid because they are paranoid but because they keep putting"
                + " themselves deliberately into paranoid avoidable situations";
        System.out.println("The sentence : "+sentence);
        System.out.println("\n----------------- The frequency of words -----------------");
        String[] words = sentence.toLowerCase().split(" ");
        String result = "";
        MyHashMap<String, Integer> hashMap = new MyHashMap<>();
        for (String word : words) {
            Integer value = hashMap.get(word);
            if (value == null) {
                value = 1;
            } else {
                value += 1;
            }
            hashMap.add(word, value);
        }
        hashMap.remove("avoidable");

        LinkedHashSet<String> set = new LinkedHashSet<String>(Arrays.asList(words));
        for (String word : set) {
            result = result + word + " : " + hashMap.get(word) + "\n";
        }
        System.out.println(result);
    }

}