import java.io.*;
import java.util.*;

// quicksort
public class Sort {

  public static void main(String[] args) throws IOException {

    ArrayList < String > words = new ArrayList < String > ();
    BufferedReader br = new BufferedReader(new FileReader(new File(args[0])));

    String currentLine = null;
    while ((currentLine = br.readLine()) != null) {
      words.add(currentLine);
    }

    String[] wordArray = words.toArray(new String[1]);

    // quick sort the array of words
    quickSort(wordArray, 0, wordArray.length - 1);

    for (int i = 0; i < wordArray.length; i++) {
      System.out.println(wordArray[i]);
    }

  }

  public static int partition(String wordArray[], int low, int high) {
    String pivot = wordArray[high];
    int i = (low - 1); // index of smaller element
    for (int j = low; j < high; j++) {
      // If current element is less than the pivot
      if (wordArray[j].compareTo(pivot) < 0) {
        i++;

        // swap wordArray[i] and wordArray[j]
        String temporary = wordArray[i];
        wordArray[i] = wordArray[j];
        wordArray[j] = temporary;
      }
    }

    // swap wordArray[i+1] and wordArray[high] (or pivot)
    String temporary = wordArray[i + 1];
    wordArray[i + 1] = wordArray[high];
    wordArray[high] = temporary;

    return i + 1;
  }

  public static void quickSort(String wordArray[], int low, int high) {
    if (low < high) {
      int partition_index = partition(wordArray, low, high);

      // Recursively sort elements before
      // partition and after partition
      quickSort(wordArray, low, partition_index - 1);
      quickSort(wordArray, partition_index + 1, high);
    }
  }




}