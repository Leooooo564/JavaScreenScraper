package classes;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

  public static String[] scanData(String filepath) throws FileNotFoundException {

    String[] data = new String[3];

    try {
      File file = new File(filepath);
      Scanner scan = new Scanner(file);

      int i = 0;
      while (scan.hasNextLine()) {
        String line = scan.nextLine();
        data[i] = line;
        i++;
      }
      scan.close();
    } catch (Exception e) {
      System.out.println("Hoppalla...");
      e.printStackTrace();
    }
    return data;
  }
}