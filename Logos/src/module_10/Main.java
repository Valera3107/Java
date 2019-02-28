package module_10;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
  public static void main(String[] args) {
    //checkInputtedString();

//    changeWords("Practise your English conversation skills in this section for beginners to advanced" +
//      " level learners. Watch and listen to videos of conversations and take the role of");

    //amountOfTheWords("Practise your English conversation skills in this section for beginners to advanced" +
    //" level learners. Watch and listen to videos of conversations and take the role of");

//    sentenceAmount("Practise your English conversation skills in this section for beginners to advanced" +
//      " level learners. Watch and listen. Videos of conversations and take the role of");


    mostFrequentlyWord("Made glorious summer by this sun of York;\n" +
      "And all the clouds that lour'd upon our house\n" +
      "In the deep bosom of the ocean buried.\n" +
      "Now are our brows bound with victorious wreaths;\n" +
      "Our bruised arms hung up for monuments;\n" +
      "Our stern alarums changed to merry meetings,\n" +
      "Our dreadful marches to delightful measures.\n" +
      "Grim-visaged war hath smooth'd his wrinkled front;\n" +
      "And now, instead of mounting barded steeds\n" +
      "To fright the souls of fearful adversaries,\n" +
      "He capers nimbly in a lady's chamber\n" +
      "To the lascivious pleasing of a lute.\n" +
      "But I, that am not shaped for sportive tricks,\n" +
      "Nor made to court an amorous looking-glass;\n" +
      "I, that am rudely stamp'd, and want love's majesty\n" +
      "To strut before a wanton ambling nymph;\n" +
      "I, that am curtail'd of this fair proportion,");

  }

  private static void mostFrequentlyWord(String string) {
    String[] words = string.split(" | \\. | ,|,| , ");
    for (String s : words
      ) {
      s.toLowerCase();
    }

    TreeMap<String, Integer> map = new TreeMap<>();
    for (String s : words
      ) {
      String word = s.toLowerCase();
      map.merge(word, 1, (a, b) -> a + b);
    }

    AtomicInteger maxValue = new AtomicInteger();

    map.forEach((key, value) -> {
      System.out.println(key + " -> " + value);
      if (maxValue.get() < value) {
        maxValue.set(value);
      }
    });

    map.forEach((String key, Integer value) -> {
      if (maxValue.get() == value) System.out.println("Most popular word: " + key);
    });

  }

  private static void sentenceAmount(String str) {
    String[] arr = str.split("\\.");
    System.out.println("Number of sentence = " + arr.length);
  }

  private static void changeWords(String str) {
    char[] arr = str.toCharArray();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 'a' || arr[i] == 'i' || arr[i] == 'e' || arr[i] == 'o' || arr[i] == 'j') {
        arr[i] = '-';
      }
    }
    String string = new String(arr);
    System.out.println(string);
  }

  private static void amountOfTheWords(String str) {
    String[] arr = str.split(" ");
    System.out.println(arr.length);
  }

  private static void checkInputtedString() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input string form 5 words:");
    String str = scanner.nextLine();
    if (str.length() != 5)
      System.out.println("You have inputted word which consists less or bigger then 5 words. Try again!!!");
    else System.out.println("Well done!!!");
  }
}
