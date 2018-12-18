package jliu2882;

/**
 *
 * Key Concepts: Looping through ArrayLists
 * Problem: We have to create a class that has a list that can be manipulated by the user
 *
 */
public class Main {

    public static void main(String[] args) {
        /**
         * Creates the WordList animals, and adds some animals
         */
        WordList animals = new WordList();
        animals.addWords("cat");
        animals.addWords("mouse");
        animals.addWords("frog");
        animals.addWords("dog");
        animals.addWords("dog");

        /**
         * Prints the number of animals whose String is the same length as 4, 3, and 2
         */
        System.out.println(animals.numWordsOfLength(4));
        System.out.println(animals.numWordsOfLength(3));
        System.out.println(animals.numWordsOfLength(2));

        /**
         * Removes the words of length 4, 3, and 2
         * Print it after each time
         */
        animals.removeWordsOfLength(4);
        System.out.println(animals.toString());
        animals.removeWordsOfLength(3);
        System.out.println(animals.toString());
        animals.removeWordsOfLength(2);
        System.out.println(animals.toString());
    }
}
