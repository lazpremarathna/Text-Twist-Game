
import java.util.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Laz
 */
class WordSet {

    private char[] letters = new char[6];
    private List<String> wordList = new ArrayList<String>();
    HashSet<String> dict = new HashSet<String>();

    public WordSet(char a, char b, char c, char d, char e, char f, HashSet<String> dict) {
        this.dict = dict;
        letters[0] = a;
        letters[1] = b;
        letters[2] = c;
        letters[3] = d;
        letters[4] = e;
        letters[5] = f;
    }

    public List<String> getWords() {
        wordCreate("", new ArrayList<Integer>(), 3);
        wordCreate("", new ArrayList<Integer>(), 4);
        wordCreate("", new ArrayList<Integer>(), 5);
        wordCreate("", new ArrayList<Integer>(), 6);
        List<String> out = new ArrayList<String>();
        for (String j : wordList) {
            if (dict.contains(j)) {
                out.add(j);
            }
        }
        return out;
    }

    private void wordCreate(String current, List<Integer> occupied, int remaining) {
        for (int x = 0; x < 6; x++) {
            if (!occupied.contains(x)) {
                if (remaining > 1) {
                    List<Integer> temp = new ArrayList<Integer>(occupied);
                    temp.add(x);
                    wordCreate(current + letters[x], temp, remaining - 1);
                } else {
                    wordList.add(current + letters[x]);
                }
            }
        }
    }
}
