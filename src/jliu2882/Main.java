package jliu2882;

public class Main {

    public static void main(String[] args) {
        WordList animals = new WordList();
        animals.addWords("cat");
        animals.addWords("mouse");
        animals.addWords("frog");
        animals.addWords("dog");
        animals.addWords("dog");

        System.out.println(animals.numWordsOfLength(4));
        System.out.println(animals.numWordsOfLength(3));
        System.out.println(animals.numWordsOfLength(2));

        animals.removeWordzOfLength(4);
        System.out.println(animals.toString());
        animals.removeWordzOfLength(3);
        System.out.println(animals.toString());
        animals.removeWordzOfLength(2);
        System.out.println(animals.toString());
    }
}
