public class L1ProgramingExercises {
    public static void main (String[] args) {
        String[] anagrams = {
                "Listen = Silent",
                "Astronomer = Moon starer",
                "Triangle = Integral",
                "Dormitory = Dirty room",
                "The Morse Code = Here come dots"
        };
        System.out.println("Here are 5 9-letter anagrams:");
        for (String anagram : anagrams) {
            System.out.println(anagram);
        }
    }
}
