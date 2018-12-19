package module_2_15;

import java.util.HashMap;

public class MyTranslator {
  private HashMap<String, String> dictionary;

  public void addNewWord(String englishWord, String russianWord) {
    dictionary.put(englishWord, russianWord);
    System.out.println("Successfully added!");
  }

  public void translate(String englishWord) {
    System.out.print(" " + dictionary.get(englishWord) + " ");
  }
}
