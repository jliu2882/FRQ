package jliu2882;

import java.util.ArrayList;

public class WordList {
    /**
     * Creates an list of Strings
     * Originally did not have <String>
     */
    private ArrayList<String> myList;

    /**
     * Initializes the parameter set up
     */
    public WordList(){
        this.myList = new ArrayList<>();
    }

    /**
     * Created a function that adds words to the list
     * @param word is the String added to the list
     */
    public void addWords(String word){
        myList.add(word);
    }

    /**
     * Created a function that loops through the function for words of same length
     * @param len is the length of words we are looking for
     * @return the number of words of len length
     */
    public int numWordsOfLength(int len){
        int count = 0;
        for(String words : myList){
            if(words.length()==len){
                count++;
            }
        }
        return count;
    }

    /**
     * Created a function that loops through the function and removes words of len length
     * @param len is the length of words we are removing
     */
    public void removeWordsOfLength(int len){
        for(int i = myList.size()-1; i >= 0;i--){
            if(myList.get(i).length()==len){
                myList.remove(i);
            }
        }
    }

    /**
     * Created a function to print the list
     * @return the list in String format
     */
    public String toString(){
        String result = "";
        for(String words : myList){
            result+= words + " ";
        }
        return result;
    }
}
