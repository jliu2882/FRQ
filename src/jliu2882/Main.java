package jliu2882;

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
        animals.removeWordzOfLength(4);
        System.out.println(animals.toString());
        animals.removeWordzOfLength(3);
        System.out.println(animals.toString());
        animals.removeWordzOfLength(2);
        System.out.println(animals.toString());
    }
}
